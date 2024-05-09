package com.example.ebook.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ebook.databinding.LoginBinding
import com.example.ebook.databinding.RegisterBinding

class RegisterFragment: Fragment() {

    private lateinit var binding:RegisterBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=RegisterBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnRegister.setOnClickListener{
            registerClick()
        }
    }

    fun registerClick(){
        var name = binding.edtName.toString()
        var email = binding.edtEmail.toString()
        var password = binding.adtPassword.toString()
        var rePassord= binding.edtRePassword.toString()
        var phone = binding.edtPhone.toString()
    }

}