package com.example.ebook.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ebook.model.Book
import com.example.ebook.repository.BookRepository
import io.reactivex.rxjava3.disposables.CompositeDisposable

class AuthorViewModel: ViewModel() {

    private var disposable = CompositeDisposable()
    private var bookRepository= BookRepository()

    var bookList=MutableLiveData<MutableList<Book>>()
    var errorLiveData = MutableLiveData<String>()

    fun findBookList(id:Int) {
        disposable.add(bookRepository.findByAuthorID(id)
            .subscribe({ jsonElement ->
                bookList.postValue(Book.getBookList(jsonElement))
            }, { error ->
                errorLiveData.postValue("Error loading genres: ${error.message}")
            })
        )
    }

    override fun onCleared() {
        super.onCleared()
        disposable.dispose()
    }
}