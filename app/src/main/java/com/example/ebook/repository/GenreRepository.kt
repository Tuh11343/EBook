package com.example.ebook.repository

import android.util.Log
import com.example.ebook.network.RetrofitClient
import com.example.ebook.network.api.GenreAPIService
import com.google.gson.JsonElement
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers

class GenreRepository {
    private val apiService: GenreAPIService =
        RetrofitClient.get()!!.create(GenreAPIService::class.java)

    fun getAllGenres(limit: Int?, offset: Int?): Single<JsonElement> {
        return apiService.findAll(limit, offset)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .onErrorResumeNext { throwable: Throwable ->
                Log.i("ERROR", "Get all genres error: $throwable")
                Single.error(throwable)
            }
    }



}