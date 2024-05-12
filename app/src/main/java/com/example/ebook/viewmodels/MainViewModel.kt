package com.example.ebook.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ebook.model.Account
import com.example.ebook.model.Author
import com.example.ebook.model.Book
import com.example.ebook.model.Subscription
import com.example.ebook.model.SubscriptionHistory
import com.example.ebook.repository.AccountRepository
import com.example.ebook.repository.SubscriptionHistoryRepository
import com.example.ebook.repository.SubscriptionRepository
import io.reactivex.rxjava3.disposables.CompositeDisposable

class MainViewModel:ViewModel() {

    private var accountRepository= AccountRepository()
    private var subscriptionRepository= SubscriptionRepository()
    private var subscriptionHistoryRepository= SubscriptionHistoryRepository()
    private var disposable = CompositeDisposable()


    var selectedBook=MutableLiveData<Book?>()
    var selectedAuthor=MutableLiveData<Author?>()
    var lastState=MutableLiveData<CurrentState>()
    var lastState2=MutableLiveData<CurrentState?>()
    var currentState=MutableLiveData(CurrentState.Home)
    var appBarVisibility=MutableLiveData<Boolean>()
    var songControlVisibility=MutableLiveData<Boolean>()
    var bottomBarVisibility=MutableLiveData<Boolean>()
    var currentAccount=MutableLiveData<Account>()
    var currentAccountSubscription=MutableLiveData<Subscription>()
    var currentAccountSubscriptionHistory=MutableLiveData<SubscriptionHistory>()
    var errorLiveData=MutableLiveData<String>()
    var resetAudio=MutableLiveData<Unit>()
    var bottomBarTab=MutableLiveData<Int>()

    var updateSubscription=MutableLiveData<Unit>()
    var updateSubscriptionHistory=MutableLiveData<Unit>()

    fun updateSubscription(subscription: Subscription) {
        disposable.add(subscriptionRepository.update(subscription)
            .subscribe({ jsonElement ->
                updateSubscription.postValue(Unit)

            }, { error ->
                errorLiveData.value = "Error update subscription: ${error.message}"
            })
        )
    }

    fun updateSubscriptionHistory(subscriptionHistory: SubscriptionHistory) {
        disposable.add(subscriptionHistoryRepository.update(subscriptionHistory)
            .subscribe({ jsonElement ->
                updateSubscriptionHistory.postValue(Unit)

            }, { error ->
                errorLiveData.value = "Error update subscription history: ${error.message}"
            })
        )
    }


    fun findAccountSubscription(accountID:Int) {
        disposable.add(subscriptionRepository.getSubscriptionByAccountID(accountID)
            .subscribe({ jsonElement ->
                currentAccountSubscription.postValue(Subscription.getSubscription(jsonElement))

            }, { error ->
                errorLiveData.value = "Error loading genres: ${error.message}"
            })
        )
    }

    fun findAccountSubscriptionHistory(subscriptionID:Int) {
        disposable.add(subscriptionHistoryRepository.findBySubscriptionID(subscriptionID)
            .subscribe({ jsonElement ->
                currentAccountSubscription.postValue(Subscription.getSubscription(jsonElement))

            }, { error ->
                errorLiveData.value = "Error find subscription history by subscription id: ${error.message}"
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
        selectedBook.value=book
    }

    fun updateSelectedAuthor(author:Author?){
        selectedAuthor.postValue(author)
    }

    fun updateCurrentState(state:CurrentState){
        lastState.value=currentState.value
        currentState.postValue(state)
    }

    fun updateLastState(state:CurrentState){
        lastState.postValue(state)
    }

    fun updateLastState2(state:CurrentState?){
        lastState2.value=state
    }

    fun updateAppBarVisibility(boolean:Boolean){
        appBarVisibility.postValue(boolean)
    }

    fun updateSongControlVisibility(boolean:Boolean){
        songControlVisibility.postValue(boolean)
    }

    fun updateBottomBarVisibility(boolean: Boolean){
        bottomBarVisibility.postValue(boolean)
    }

    fun updateBottomBarTab(index:Int){
        bottomBarTab.value=index
    }

    fun resetAudio(){
        resetAudio.postValue(Unit)
    }

    override fun onCleared() {
        disposable.dispose()
        super.onCleared()
    }


    companion object{
        enum class CurrentState{
            Home,DetailBook,ReadBook,Search,SignIn,User,SignUp,Author,Subscription,Favorite
        }
    }
}