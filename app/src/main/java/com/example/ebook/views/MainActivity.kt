package com.example.ebook.views

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ebook.adapter.GenreAdapter
import com.example.ebook.api.GenreAPIService
import com.example.ebook.databinding.MainBinding
import com.example.ebook.model.Genre
import com.example.ebook.model.GenresResponse
import com.example.ebook.utils.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.IOException


class MainActivity : ComponentActivity() {
    private lateinit var binding: MainBinding
    private var genreList= mutableListOf<Genre>()
    private lateinit var genreAdapter: GenreAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = MainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val apiService: GenreAPIService = RetrofitClient.get()!!.create(GenreAPIService::class.java)
        val call: Call<GenresResponse> = apiService.findAll()
        call.enqueue(object : Callback<GenresResponse> {
            override fun onResponse(call: Call<GenresResponse>, response: Response<GenresResponse>) {
                if (response.isSuccessful) {
                    try {
                        genreAdapter=GenreAdapter(response.body()!!.genres)
                        binding.genreList.layoutManager =
                            LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
                        binding.genreList.adapter=genreAdapter

                    } catch (e: IOException) {
                        e.printStackTrace()
                    }
                } else {
                    Log.i("Nothing","Du lieu rong:"+response.body())
                }
            }

            override fun onFailure(call: Call<GenresResponse>, t: Throwable) {
                t.printStackTrace()
                Log.e("ERROR","Loi:${t.toString()}")
            }
        })

    }
}

