package com.example.ebook.fragment

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.ebook.databinding.FragmentUserLoginBinding
import com.example.ebook.utils.AppInstance
import com.example.ebook.viewmodels.MainViewModel
import com.example.ebook.viewmodels.UserLoginViewModel


class FragmentUserLogin : Fragment() {

    private lateinit var binding: FragmentUserLoginBinding
    private lateinit var mainViewModel: MainViewModel
    private lateinit var userLoginViewModel: UserLoginViewModel
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        sharedPreferences = requireContext().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        mainViewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
        userLoginViewModel = ViewModelProvider(requireActivity())[UserLoginViewModel::class.java]
        binding = FragmentUserLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        setUpBinding()
        binding.btnUpgrade.setOnClickListener {
            mainViewModel.updateCurrentState(MainViewModel.Companion.CurrentState.Subscription)
        }

        binding.btnLogOut.setOnClickListener {

            val editor = sharedPreferences.edit()
            editor.remove(AppInstance.ACCOUNT_ID_KEY.toString())
            editor.apply()

            AppInstance.resetAccount()

            mainViewModel.updateBottomBarTab(0)
            Toast.makeText(requireContext(),"Đăng xuất thành công",Toast.LENGTH_SHORT).show()
        }

        binding.btnShare.setOnClickListener {
            val appPackageName = "Ebook"
            val playStoreLink = "https://play.google.com/store/apps/details?id=$appPackageName"

            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(
                Intent.EXTRA_TEXT,
                "Hãy thử ngay ứng dụng của chúng tôi! $playStoreLink"
            )
            startActivity(Intent.createChooser(intent, "Chia sẻ ứng dụng"))
        }

        binding.btnAboutUs.setOnClickListener {
            val url = "https://www.facebook.com/profile.php?id=100016131127774&locale=vi_VN"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        binding.btnContactSupport.setOnClickListener {
            val url = "https://www.facebook.com/profile.php?id=100016131127774&locale=vi_VN"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
    }

    private fun setUpBinding() {
        userLoginViewModel.findUserByAccountID(AppInstance.currentAccount!!.id!!)
        observe()
    }

    private fun observe() {
        userLoginViewModel.user.observe(viewLifecycleOwner) {
            binding.userName.text = it.name
        }
    }


}