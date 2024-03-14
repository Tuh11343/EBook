package com.example.ebook.viewmodels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ebook.model.Lyric

class SongViewModel : ViewModel() {

    var currentLyric = MutableLiveData<String>()
    var totalLyrics = MutableLiveData<String>()
    var lyricList = MutableLiveData<MutableList<Lyric>>()
    var start = MutableLiveData<Int>()
    var positionChanged = MutableLiveData<Int>()

    fun updateTotalLyrics(totalLyrics: String) {
        try {
            this.totalLyrics.value = totalLyrics
        } catch (e: Exception) {
            Log.e("ERROR", "UpdateTotalLyrics:${e}")
        }
    }

    fun updateLyric(lyric: String) {
        try {
            currentLyric.value = lyric

        } catch (e: Exception) {

        }
    }

    fun updateStart(start: Int) {
        try {
            this.start.value = start

        } catch (e: Exception) {

        }
    }

    fun updateLyricList(lyricList: MutableList<Lyric>) {
        try {
            this.lyricList.value = lyricList

        } catch (e: Exception) {

        }
    }

    fun updatePositionChanged() {
        try {
            positionChanged.value = 0
        } catch (e: Exception) {

        }
    }
}