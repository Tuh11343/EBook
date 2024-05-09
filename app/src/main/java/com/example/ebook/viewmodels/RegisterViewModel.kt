package com.example.ebook.viewmodel

import androidx.lifecycle.ViewModel
import com.example.ebook.model.Account
import com.example.ebook.network.api.AccountAPIService

class RegisterViewModel : ViewModel() {

    fun registerAccount(account: Account) {
        return AccountAPIService.register
    }
}
