package com.example.ebook.network.api

import com.google.gson.JsonElement
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface BookAPIService {

    @GET("/api/v1/book")
    fun findAll(@Query("limit") limit:Int?, @Query("offset") offset:Int?): Single<JsonElement>

    @GET("/api/v1/book/genre")
    fun findByGenreID(@Query("limit") id:Int,@Query("limit") limit:Int?, @Query("offset") offset:Int?): Single<JsonElement>

    @GET("/api/v1/book/normal")
    fun findNormalBook(@Query("limit") limit:Int?, @Query("offset") offset:Int?): Single<JsonElement>

    @GET("/api/v1/book/premium")
    fun findPremiumBook(@Query("limit") limit:Int?, @Query("offset") offset:Int?): Single<JsonElement>

}