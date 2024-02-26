package com.example.ebook.utils

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RetrofitClient{
    companion object {
        private var retrofit: Retrofit? = null
        private const val BASE_URL = "http://192.168.1.194:3000"

        fun get(): Retrofit {
            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit!!
        }
    }
}
