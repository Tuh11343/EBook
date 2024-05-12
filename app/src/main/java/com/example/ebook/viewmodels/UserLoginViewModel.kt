package com.example.ebook.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ebook.model.User
import com.example.ebook.repository.UserRepository
import io.reactivex.rxjava3.disposables.CompositeDisposable

class UserLoginViewModel: ViewModel() {

    private var disposable = CompositeDisposable()
    private var userRepository= UserRepository()

    var user=MutableLiveData<User>()
    var errorLiveData = MutableLiveData<String>()

    fun findUserByAccountID(id:Int) {
        disposable.add(userRepository.findByAccountID(id)
            .subscribe({ jsonElement ->
                user.postValue(User.getUser(jsonElement))
            }, { error ->
                errorLiveData.postValue("Error loading user: ${error.message}")
            })
        )
    }

    override fun onCleared() {
        super.onCleared()
        disposable.dispose()
    }
}