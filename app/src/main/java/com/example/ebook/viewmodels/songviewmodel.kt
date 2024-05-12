package com.example.ebook.viewmodels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ebook.model.Lyric

class SongViewModel : ViewModel() {

    var isReadBook = MutableLiveData<Boolean>()
    var currentLyric = MutableLiveData<String>()
    var totalLyrics = MutableLiveData<String>()
    var lyricList = MutableLiveData<MutableList<Lyric>>()
    var start = MutableLiveData<Int>()

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

}