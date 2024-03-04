package com.example.ebook.api

import com.google.gson.JsonElement
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface GenreAPIService {
    @GET("/genre/id")
    fun findByID(@Query("id") id:Int):Call<JsonElement>

    @GET("/genre")
    fun findAll(@Query("limit") limit:Int, @Query("offset") offset:Int):Call<JsonElement>

    @POST("/payment-sheet")
    fun payment():Call<JsonElement>

}