package com.example.ebook.network.api

import com.google.gson.JsonElement
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface GenreAPIService {
    @GET("/genre/id")
    fun findByID(@Query("id") id:Int):Single<JsonElement>

    @GET("/genre")
    fun findAll(@Query("limit") limit:Int?, @Query("offset") offset:Int?): Single<JsonElement>

    @POST("/payment-sheet")
    fun payment():Single<JsonElement>

}