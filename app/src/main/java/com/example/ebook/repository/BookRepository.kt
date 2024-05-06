package com.example.ebook.repository

import android.util.Log
import com.example.ebook.network.RetrofitClient
import com.example.ebook.network.api.BookAPIService
import com.google.gson.JsonElement
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers

class BookRepository {

    private val apiService: BookAPIService =
        RetrofitClient.get()!!.create(BookAPIService::class.java)

    fun findAll(limit: Int?, offset: Int?): Single<JsonElement> {
        return apiService.findAll(limit, offset)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .onErrorResumeNext { throwable: Throwable ->
                Log.i("ERROR", "Get all book error: $throwable")
                Single.error(throwable)
            }
    }

    fun findByGenreID(id:Int,limit: Int?, offset: Int?): Single<JsonElement> {
        return apiService.findByGenreID(id,limit,offset)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .onErrorResumeNext { throwable: Throwable ->
                Log.i("ERROR", "Get all book error: $throwable")
                Single.error(throwable)
            }
    }

}