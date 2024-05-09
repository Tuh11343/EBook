package com.example.ebook.repository

import android.util.Log
import com.example.ebook.model.Account
import com.example.ebook.network.RetrofitClient
import com.example.ebook.network.api.PaymentAPIService
import com.google.gson.JsonElement
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers

class PaymentRepository {

    private val apiService: PaymentAPIService =
        RetrofitClient.get()!!.create(PaymentAPIService::class.java)

    fun paymentRequest(account: Account): Single<JsonElement> {
        return apiService.paymentRequest(account)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .onErrorResumeNext { throwable: Throwable ->
                Log.i("ERROR", "Get all payment error: $throwable")
                Single.error(throwable)
            }
    }

}