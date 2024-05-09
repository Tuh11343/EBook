package com.example.ebook.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ebook.model.Account
import com.example.ebook.model.Book
import com.example.ebook.model.Subscription
import com.example.ebook.repository.AccountRepository
import com.example.ebook.repository.SubscriptionRepository
import io.reactivex.rxjava3.disposables.CompositeDisposable

class MainViewModel:ViewModel() {

    private var accountRepository= AccountRepository()
    private var subscriptionRepository= SubscriptionRepository()
    private var disposable = CompositeDisposable()


    var selectedBook=MutableLiveData<Book?>()
    var lastState=MutableLiveData<CurrentState>()
    var currentState=MutableLiveData(CurrentState.Home)
    var appBarVisibility=MutableLiveData<Boolean>()
    var showSongControl=MutableLiveData<Boolean>()
    var showBottomBar=MutableLiveData<Boolean>()
    var currentAccount=MutableLiveData<Account>()
    var currentAccountSubscription=MutableLiveData<Subscription>()
    var errorLiveData=MutableLiveData<String>()

    fun findAccountSubscription(accountID:Int) {
        disposable.add(subscriptionRepository.getSubscriptionByAccountID(accountID)
            .subscribe({ jsonElement ->
                currentAccountSubscription.postValue(Subscription.getSubscription(jsonElement))

            }, { error ->
                errorLiveData.value = "Error loading genres: ${error.message}"
            })
        )
    }

    fun findAccountByID(accountID:Int) {
        disposable.add(accountRepository.findByID(accountID)
            .subscribe({ jsonElement ->
                currentAccount.postValue(Account.getAccount(jsonElement))
            }, { error ->
                errorLiveData.postValue("Error find account by id: ${error.message}")
            })
        )
    }

    fun updateSelectedBook(book:Book?){
        selectedBook.postValue(book)
    }

    fun updateCurrentState(state:CurrentState){
        lastState.postValue(currentState.value)
        currentState.postValue(state)
    }

    fun updateAppBarVisibility(boolean:Boolean){
        appBarVisibility.postValue(boolean)
    }

    fun updateShowSongControl(boolean: Boolean){
        showSongControl.postValue(boolean)
    }

    fun updateShowBottomBar(boolean: Boolean){
        showBottomBar.postValue(boolean)
    }

    override fun onCleared() {
        disposable.dispose()
        super.onCleared()
    }


    companion object{
        enum class CurrentState{
            Home,DetailBook,ReadBook,Search,SignIn,User,SignUp
        }
    }
}