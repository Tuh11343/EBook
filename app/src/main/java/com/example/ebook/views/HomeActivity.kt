package com.example.ebook.views


import android.Manifest
import android.animation.ObjectAnimator
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.os.Bundle
import android.os.IBinder
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.lifecycle.ViewModelProvider
import com.example.ebook.adapter.MainPageAdapter
import com.example.ebook.databinding.HomeBinding
import com.example.ebook.databinding.MainBinding
import com.example.ebook.services.MusicService
import com.example.ebook.viewmodels.SongViewModel


class HomeActivity : AppCompatActivity() {

    private lateinit var binding: MainBinding
    private lateinit var songViewModel: SongViewModel

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

    override fun onStart() {
        super.onStart()
        if(!isBound){
            val serviceIntent = Intent(this@HomeActivity, MusicService::class.java)
            bindService(serviceIntent, connection, Context.BIND_AUTO_CREATE)
            isBound=true
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        if (intent != null && intent.hasExtra("data")) {
            val data = intent.getStringExtra("data")
            Log.d("Nothing", "$data")
            binding.viewPager.currentItem = 1
            songViewModel.updateIsReadBook(true)
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

        binding = MainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        songViewModel=ViewModelProvider(this)[SongViewModel::class.java]

        observeIsReadBook()

        setUpViewPager()
        songViewClick()
        binding.btnPlay.setOnClickListener {
            btnPlayClick()
        }

        ActivityCompat.requestPermissions(this, arrayOf(
            Manifest.permission.POST_NOTIFICATIONS,
            Manifest.permission.FOREGROUND_SERVICE,
        ),10)

    }



    fun getMusicService(): MusicService? {
        return musicService
    }

    private fun setUpViewPager() {
        binding.viewPager.adapter = MainPageAdapter(this, binding.viewPager)
        binding.viewPager.isUserInputEnabled = false
        binding.viewPager.currentItem = 0
    }

    private fun btnPlayClick() {
        musicService!!.play()
    }

    private fun songViewClick() {
        binding.songView.setOnClickListener {
            binding.viewPager.currentItem = 1
            songViewModel.updateIsReadBook(true)
        }
    }

    private fun observeIsReadBook() {
        songViewModel.isReadBook.observe(this) { isReadBook ->
            Log.i("Nothing","IsReadBook:${isReadBook}")
            val bottomView = binding.bottomView
            val duration = 500L

            if (isReadBook) {

                val animateHide = ObjectAnimator.ofFloat(
                    bottomView, "translationY",
                    0f, bottomView.height.toFloat()
                ).apply {
                    this.duration = duration
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
        }
    }

}

