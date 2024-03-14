package com.example.ebook.viewmodels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ebook.network.api.GenreAPIService
import com.example.ebook.model.Genre
import com.example.ebook.network.RetrofitClient
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers

class GenreViewModel : ViewModel() {

    var firstLoadGenreList=MutableLiveData<MutableList<Genre>>()
    var loadMoreGenreList=MutableLiveData<MutableList<Genre>>()
    var length=MutableLiveData<Int>()
    private var mDisposable: Disposable? = null
    private val apiService: GenreAPIService =
        RetrofitClient.get()!!.create(GenreAPIService::class.java)


    //Error
    var errorLiveData=MutableLiveData<String>()


    fun firstLoadGenreList(limit: Int?, offset: Int?) {
        mDisposable = apiService.findAll(limit, offset)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ jsonElement ->
                firstLoadGenreList.value= Genre.getGenreList(jsonElement)
                length.value= Genre.getLength(jsonElement)

            }, { throwable ->
                run {
                    errorLiveData.value=throwable.toString()
                    Log.e("ERROR", "Loi getGenreList:${throwable}")
                }
            }, {
            })

    }

    fun loadMoreGenreList(limit: Int?, offset: Int?) {
        mDisposable = apiService.findAll(limit, offset)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ jsonElement ->
                loadMoreGenreList.value= Genre.getGenreList(jsonElement)
            }, { throwable ->
                run {
                    errorLiveData.value=throwable.toString()
                    Log.e("ERROR", "Loi getGenreList:${throwable}")
                }
            }, {
            })

    }

    override fun onCleared() {
        super.onCleared()
        mDisposable?.dispose()
    }

}