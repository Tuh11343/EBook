package com.example.ebook.network.api

import com.example.ebook.model.Register
import io.reactivex.rxjava3.core.Single
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface AccountAPIService {

    @POST("/register")
    fun registerAcc(@Body requestBody:  Register): Single<Void>
}