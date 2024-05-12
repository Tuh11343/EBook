package com.example.ebook.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ebook.model.Book
import com.example.ebook.repository.BookRepository
import io.reactivex.rxjava3.disposables.CompositeDisposable

class FavoriteViewModel: ViewModel() {

    private var disposable = CompositeDisposable()
    private var bookRepository= BookRepository()

    var bookList=MutableLiveData<MutableList<Book>>()
    var errorLiveData = MutableLiveData<String>()

    fun findBookList(id:Int) {
        disposable.add(bookRepository.findByFavorite(id)
            .subscribe({ jsonElement ->
                bookList.postValue(Book.getBookList(jsonElement))
            }, { error ->
                errorLiveData.postValue("Error get booklist by favorite: ${error.message}")
            })
        )
    }

    override fun onCleared() {
        super.onCleared()
        disposable.dispose()
    }
}