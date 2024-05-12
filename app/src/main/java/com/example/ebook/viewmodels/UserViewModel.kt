package com.example.ebook.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ebook.repository.UserRepository
import io.reactivex.rxjava3.disposables.CompositeDisposable

class UserViewModel: ViewModel() {

    private var disposable = CompositeDisposable()
    private var userRepository= UserRepository()

    var errorLiveData = MutableLiveData<String>()


    override fun onCleared() {
        super.onCleared()
        disposable.dispose()
    }
}