package com.example.ebook.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ebook.model.Author
import com.example.ebook.model.Lyric
import com.example.ebook.repository.AuthorRepository
import io.reactivex.rxjava3.disposables.CompositeDisposable

class AudioViewModel : ViewModel() {

    private var disposable = CompositeDisposable()
    private var authorRepository= AuthorRepository()

    var isReadBook = MutableLiveData<Boolean>()
    var currentLyric = MutableLiveData<String>()
    var totalLyrics = MutableLiveData<String>()
    var lyricList = MutableLiveData<MutableList<Lyric>>()
    var start = MutableLiveData<Int>()
    var bookAuthor=MutableLiveData<Author>()

    fun findBookAuthor(id:Int) {
        disposable.add(authorRepository.findOneByBookID(id)
            .subscribe({ jsonElement ->
                bookAuthor.value=Author.getAuthor(jsonElement)
            }, { error ->

            })
        )
    }

    fun updateTotalLyrics(totalLyrics: String) {
        this.totalLyrics.postValue(totalLyrics)
    }

    fun updateLyric(lyric: String) {
        currentLyric.postValue(lyric)
    }

    fun updateStart(start: Int) {
        this.start.postValue(start)
    }

    fun updateLyricList(lyricList: MutableList<Lyric>) {
        this.lyricList.postValue(lyricList)
    }

    fun updateIsReadBook(isReadBook: Boolean) {
        this.isReadBook.postValue(isReadBook)
    }

    override fun onCleared() {
        super.onCleared()
        disposable.dispose()
    }

}