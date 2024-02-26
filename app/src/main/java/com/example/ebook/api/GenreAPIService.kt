package com.example.ebook.api

import com.example.ebook.model.GenreResponse
import com.example.ebook.model.GenresResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface GenreAPIService {
    @GET("/genre/id/{id}")
    fun findByID(@Path("id") id:Int): Call<GenreResponse>

    @GET("/genre")
    fun findAll():Call<GenresResponse>
}