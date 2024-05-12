package com.example.ebook.views

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ObjectAnimator
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.content.SharedPreferences
import android.os.Bundle
import android.os.IBinder
import android.util.Log
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.animation.doOnEnd
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager2.widget.ViewPager2
import com.bumptech.glide.Glide
import com.example.ebook.R
import com.example.ebook.adapter.MainPageAdapter
import com.example.ebook.databinding.MainBinding
import com.example.ebook.services.MusicService
import com.example.ebook.utils.AppInstance
import com.example.ebook.viewmodels.MainViewModel
import nl.joery.animatedbottombar.AnimatedBottomBar


class MainActivity : AppCompatActivity() {

    private lateinit var binding: MainBinding
    private lateinit var mainPageAdapter: MainPageAdapter
    private lateinit var mainViewModel: MainViewModel
    private lateinit var sharedPreferences: SharedPreferences
    private var musicService: MusicService? = null
    private var isBound = false

    private val connection: ServiceConnection = object : ServiceConnection {
        override fun onServiceConnected(name: ComponentName, service: IBinder) {
            val binder: MusicService.LocalBinder = service as MusicService.LocalBinder
            musicService = binder.getService()
            Log.i("Nothing", "Bat dau ket noi")
        }

        override fun onServiceDisconnected(name: ComponentName) {
            Log.i("Nothing", "Ket noi that bai")
        }
    }

    fun getMusicService(): MusicService? {
        return musicService
    }


    override fun onStart() {
        super.onStart()
        if (!isBound) {
            val serviceIntent = Intent(this, MusicService::class.java)
            bindService(serviceIntent, connection, Context.BIND_AUTO_CREATE)
            isBound = true
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        if (intent != null && intent.hasExtra("data")) {
            val data = intent.getStringExtra("data")
            Log.d("Nothing", "$data")
            binding.viewPager.currentItem = 1

            mainViewModel.updateCurrentState(MainViewModel.Companion.CurrentState.ReadBook)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        if (isBound) {
            unbindService(connection)
            isBound = false
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setUpBinding()

        onBackPressedHandle()

        bottomBarOnTabSelect()

        setUpViewPager()
        observe()

        songControlSwipeDown()

    }

    private fun songControlSwipeDown() {
        var gestureDetector =
            GestureDetector(this, object : GestureDetector.SimpleOnGestureListener() {
                override fun onDown(e: MotionEvent): Boolean {
                    return true
                }

                override fun onFling(
                    e1: MotionEvent?,
                    e2: MotionEvent,
                    velocityX: Float,
                    velocityY: Float
                ): Boolean {
                    val distanceY = e2.y - e1!!.y
                    if (distanceY > 100) {
                        val animateHide = ObjectAnimator.ofFloat(
                            binding.songControl, "translationY",
                            0f, binding.songControl.height.toFloat()
                        ).apply {
                            this.duration = duration
                        }
                        animateHide.start()
                        animateHide.doOnEnd {
                            binding.songControl.visibility = View.GONE
                            musicService?.mediaPlayer?.pause()
                            musicService?.btnPlayClick?.postValue(Unit)
                            musicService?.cancelNotification()
                        }
                    }
                    return true
                }
            })

        binding.songControl.setOnTouchListener { _, event -> gestureDetector.onTouchEvent(event) }
    }

    private fun bottomBarOnTabSelect() {
        binding.bottomBar.setOnTabSelectListener(object : AnimatedBottomBar.OnTabSelectListener {
            override fun onTabSelected(
                lastIndex: Int,
                lastTab: AnimatedBottomBar.Tab?,
                newIndex: Int,
                newTab: AnimatedBottomBar.Tab
            ) {
                when (newIndex) {
                    mainPageAdapter.toHomeFragment() -> {
                        goToFragmentHome()
                    }

                    1 -> {
                        goToFragmentSearch()
                    }

                    3 -> {
                        goToFragmentSubscription()
                    }
                }
            }

            override fun onTabReselected(index: Int, tab: AnimatedBottomBar.Tab) {
                if (index == mainPageAdapter.toHomeFragment()) {
                    goToFragmentHome()
                }
            }
        })
    }

    private fun setUpBinding() {

        binding = MainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]

        sharedPreferences = this.getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        loadSignInAccount()

        binding.songControlClickView.setOnClickListener {
            mainViewModel.updateCurrentState(MainViewModel.Companion.CurrentState.ReadBook)
        }

        binding.btnPlay.setOnClickListener {
            musicService?.btnPlayClick?.postValue(Unit)
            musicService?.play()
            if (musicService?.mediaPlayer?.isPlaying == true) {
                binding.btnPlay.setImageResource(R.drawable.icon_pause)
            } else {
                binding.btnPlay.setImageResource(R.drawable.icon_play)
            }
        }

        topAppBarItemClick()

    }

    private fun topAppBarItemClick() {
        binding.topAppBar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.topMenu_search -> {
                    binding.bottomBar.selectTabAt(1)
                    true
                }

                R.id.user -> {
                    mainViewModel.updateCurrentState(MainViewModel.Companion.CurrentState.User)
                    true
                }

                else -> {
                    Log.i("ERROR", "Item ID:${menuItem.itemId}")
                    false
                }
            }
        }
    }

    private fun onBackPressedHandle() {
        onBackPressedDispatcher.addCallback(object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                Log.i("Nothing", "Last State:${mainViewModel.lastState.value}")
                when (mainViewModel.currentState.value) {
                    MainViewModel.Companion.CurrentState.DetailBook -> {
                        if (mainViewModel.lastState.value == MainViewModel.Companion.CurrentState.Search) {
                            mainViewModel.updateCurrentState(MainViewModel.Companion.CurrentState.Search)
                        } else {
                            mainViewModel.updateCurrentState(MainViewModel.Companion.CurrentState.Home)
                        }
                    }

                    MainViewModel.Companion.CurrentState.ReadBook -> {
                        mainViewModel.updateCurrentState(MainViewModel.Companion.CurrentState.Home)
                    }

                    MainViewModel.Companion.CurrentState.Search -> {
                        mainViewModel.updateCurrentState(MainViewModel.Companion.CurrentState.Home)
                    }

                    MainViewModel.Companion.CurrentState.SignUp->{
                        goBack()
                    }

                    MainViewModel.Companion.CurrentState.SignIn->{
                        goBack()
                    }

                    else -> {
                        showExitConfirmationDialog()
                    }
                }
            }
        })
    }

    private fun setUpViewPager() {
        mainPageAdapter = MainPageAdapter(this, binding.viewPager)

        binding.viewPager.adapter = mainPageAdapter
        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                if(position==mainPageAdapter.toFragmentSubscription()){
                    binding.viewPager.adapter?.notifyDataSetChanged()
                }
            }
        })
        binding.viewPager.isUserInputEnabled = false
        goToFragmentHome()
    }

    private fun observe() {
        observeCurrentState()
        observeAppBarVisibility()
        observeSongControl()
        observeCurrentAccount()
        observeCurrentAccountSubscription()
    }

    private fun observeSongControl() {
        mainViewModel.showSongControl.observe(this) {
            when (it) {
                true -> {
                    //Show SongView if exist
                    if (musicService?.isNotificationCreated == true) {
                        binding.songControl.visibility = View.VISIBLE

                        //update songControl data
                        Glide.with(this)
                            .load(binding.songImg)
                            .placeholder(R.drawable.song_circle)
                            .error(R.drawable.song_circle)
                            .into(binding.songImg)
                        binding.bookName.text = mainViewModel.selectedBook.value?.name
                    }
                }

                false -> {
                    binding.songControl.visibility = View.GONE
                }
            }
        }
    }

    private fun observeCurrentState() {

        mainViewModel.currentState.observe(this) { currentState ->
            when (currentState) {
                MainViewModel.Companion.CurrentState.ReadBook -> {
                    goToFragmentReadBook()

                    showBottomBar(false)
                    binding.appBar.visibility = View.GONE
                    binding.songControl.visibility = View.GONE
                }

                MainViewModel.Companion.CurrentState.DetailBook -> {
                    goToFragmentDetailBook()
                }

                MainViewModel.Companion.CurrentState.Home -> {
                    goToFragmentHome()

                    showBottomBar(true)
                    binding.appBar.visibility = View.VISIBLE
                    showSongControl()
                }

                MainViewModel.Companion.CurrentState.Search -> {
                    goToFragmentSearch()
                }

                MainViewModel.Companion.CurrentState.User -> {
                    goToFragmentUser()
                    showBottomBar(false)
                }

                MainViewModel.Companion.CurrentState.SignIn ->{
                }

                MainViewModel.Companion.CurrentState.SignUp ->{
                }

            }
        }
    }

    private fun observeCurrentAccount() {
        mainViewModel.currentAccount.observe(this) { account ->
            Toast.makeText(this@MainActivity, "Đã đăng nhập", Toast.LENGTH_SHORT).show()
            AppInstance.currentAccount = account
        }
    }

    private fun observeCurrentAccountSubscription() {
        mainViewModel.currentAccountSubscription.observe(this) { subscription ->
            AppInstance.currentSubscription = subscription
        }
    }

    private fun observeAppBarVisibility() {
        mainViewModel.appBarVisibility.observe(this) {
            when (it) {
                true -> {
                    binding.appBar.visibility = View.VISIBLE
                }

                false -> {
                    binding.appBar.visibility = View.GONE
                }
            }
        }
    }

    private fun observeSongViewVisibility() {
        /*mainViewModel.songControlVisibility.observe(this) {
            val bottomView = binding.songControl
            val duration = 500L

            if (it) {

                val animateHide = ObjectAnimator.ofFloat(
                    bottomView, "translationY",
                    0f, bottomView.height.toFloat()
                ).apply {
                    this.duration = duration
                    musicService?.mediaPlayer?.pause()
                }
                animateHide.start()
            } else {

                val animateShow = ObjectAnimator.ofFloat(
                    bottomView, "translationY",
                    bottomView.height.toFloat(), 0f
                ).apply {
                    this.duration = duration
                }
                animateShow.start()
            }
        }*/
    }

    private fun showSongControl() {
        if (musicService?.isNotificationCreated == true) {
            binding.songControl.visibility = View.VISIBLE

            //update songControl data
            Glide.with(this)
                .load(binding.songImg)
                .placeholder(R.drawable.song_circle)
                .error(R.drawable.song_circle)
                .into(binding.songImg)
            binding.bookName.text = mainViewModel.selectedBook.value?.name
            if (musicService!!.mediaPlayer!!.isPlaying) {
                binding.btnPlay.setImageResource(R.drawable.icon_pause)
            } else {
                binding.btnPlay.setImageResource(R.drawable.icon_play)
            }

        }
    }

    private fun goToFragmentDetailBook() {
        binding.viewPager.setCurrentItem(mainPageAdapter.toFragmentDetailBook(), false)
        mainViewModel.updateAppBarVisibility(false)
    }

    private fun goToFragmentHome() {
        binding.viewPager.setCurrentItem(mainPageAdapter.toHomeFragment(), false)
        mainViewModel.updateAppBarVisibility(true)
        showSongControl()
    }

    private fun goToFragmentSearch() {
        binding.viewPager.setCurrentItem(mainPageAdapter.toFragmentSearch(), false)
        mainViewModel.updateAppBarVisibility(false)
    }

    private fun goToFragmentUser() {
        binding.viewPager.setCurrentItem(mainPageAdapter.toFragmentUser(), false)
        mainViewModel.updateAppBarVisibility(false)
    }

    private fun goToFragmentReadBook() {
        binding.viewPager.setCurrentItem(mainPageAdapter.toReadBookFragment(), false)
        mainViewModel.updateAppBarVisibility(false)
    }

    private fun goToFragmentSubscription() {
        binding.viewPager.setCurrentItem(mainPageAdapter.toFragmentSubscription(), false)
        /*mainViewModel.updateAppBarVisibility(false)*/
    }

    private fun showBottomBar(it: Boolean) {
        if (!it) {
            /*val animateHide = ObjectAnimator.ofFloat(
                binding.bottomBar, "translationY",
                0f, binding.bottomBar.height.toFloat()
            ).apply {
                this.duration = duration
            }

            animateHide.addListener(object : AnimatorListenerAdapter() {
                override fun onAnimationEnd(animation: Animator) {
                    binding.bottomBar.visibility=View.GONE
                }
            })

            animateHide.start()*/
            binding.bottomBar.visibility = View.GONE
        } else {
            binding.bottomBar.visibility = View.VISIBLE
            val animateShow = ObjectAnimator.ofFloat(
                binding.bottomBar, "translationY",
                binding.bottomBar.height.toFloat(), 0f
            ).apply {
                this.duration = duration
            }

            animateShow.addListener(object : AnimatorListenerAdapter() {
                override fun onAnimationEnd(animation: Animator) {
                }
            })

            animateShow.start()
        }
    }

    private fun showExitConfirmationDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Xác nhận")
        builder.setMessage("Bạn có muốn thoát ứng dụng?")
        builder.setPositiveButton("Có") { _, _ ->
            finish()
        }
        builder.setNegativeButton("Không") { dialog, _ ->
            dialog.dismiss()
        }
        val dialog = builder.create()
        dialog.show()
    }

    private fun loadSignInAccount() {
        val currentAccountID = sharedPreferences.getInt(AppInstance.ACCOUNT_ID_KEY.toString(), -1)
        val isGoogleAccount = sharedPreferences.getBoolean(AppInstance.IS_GOOGLE_ACCOUNT.toString(), false)

        AppInstance.isGoogleAccount=isGoogleAccount

        if (currentAccountID != -1) {
            mainViewModel.findAccountByID(currentAccountID)
            mainViewModel.findAccountSubscription(currentAccountID)
        } else {
            Toast.makeText(this, "Bạn chưa đăng nhập", Toast.LENGTH_SHORT).show()
        }
    }

    private fun goBack(){
        this.supportFragmentManager.popBackStack()
    }
}

