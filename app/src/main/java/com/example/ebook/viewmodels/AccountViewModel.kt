package com.example.ebook.viewmodels

import androidx.lifecycle.ViewModel
import com.example.ebook.network.RetrofitClient
import com.example.ebook.network.api.AccountAPIService
import com.example.ebook.network.api.GenreAPIService
import io.reactivex.rxjava3.disposables.Disposable

class AccountViewModel: ViewModel() {

    private var mDisposable: Disposable? = null
    private val apiService: AccountAPIService =
        RetrofitClient.get()!!.create(AccountAPIService::class.java)

    fun checkLogin():Boolean{
        apiService.registerAcc()
    }

    override fun onCleared() {
        super.onCleared()
        mDisposable?.dispose()
    }

}