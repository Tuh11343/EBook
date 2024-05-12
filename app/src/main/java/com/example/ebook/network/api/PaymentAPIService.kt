package com.example.ebook.network.api


import com.example.ebook.model.Account
import com.google.gson.JsonElement
import io.reactivex.rxjava3.core.Single
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Query


interface PaymentAPIService {

    @POST("/api/v1/payment")
    fun paymentRequest(@Query("accountID") accountID:Int, @Query("total") total:Float):Single<JsonElement>

}