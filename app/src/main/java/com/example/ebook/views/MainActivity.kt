package com.example.ebook.views

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ebook.adapter.GenreAdapter
import com.example.ebook.api.GenreAPIService
import com.example.ebook.databinding.MainBinding
import com.example.ebook.model.Genre
import com.example.ebook.utils.PaginationScrollListener
import com.example.ebook.utils.RetrofitClient
import com.google.gson.JsonElement
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

        getGenres()

    }

    private fun getGenres() {
        val apiService: GenreAPIService = RetrofitClient.get()!!.create(GenreAPIService::class.java)

        val call: Call<JsonElement> = apiService.findAll(12, 0)
        call.enqueue(object : Callback<JsonElement> {
            override fun onResponse(
                call: Call<JsonElement>,
                response: Response<JsonElement>
            ) {
                if (response.isSuccessful) {
                    try {
                        var jsonElement=response.body()!!

                        genreAdapter =
                            GenreAdapter(Genre.getGenreList(jsonElement),Genre.getLength(jsonElement))
                        binding.genreList.layoutManager =
                            LinearLayoutManager(
                                this@MainActivity,
                                LinearLayoutManager.VERTICAL,
                                false
                            )
                        binding.genreList.adapter = genreAdapter

                        binding.genreList.addOnScrollListener(object: PaginationScrollListener(binding.genreList.layoutManager as LinearLayoutManager){
                            override fun loadMoreItem() {
                                Toast.makeText(this@MainActivity,"Load more item", Toast.LENGTH_SHORT).show()
                                genreAdapter.addFooterLoading()
                                val call: Call<JsonElement> = apiService.findAll(2,genreAdapter.genreList.size-1)
                                call.enqueue(object : Callback<JsonElement> {
                                    override fun onResponse(
                                        call: Call<JsonElement>,
                                        response: Response<JsonElement>
                                    ) {
                                        val handler = Handler(Looper.getMainLooper())

                                        val runnable = Runnable {
                                            genreAdapter.removeFooterLoading()
                                            genreAdapter.genreList.addAll(Genre.getGenreList(response.body()!!))
                                            genreAdapter.updateUI()
                                        }

                                        handler.postDelayed(runnable, 2000)
                                    }

                                    override fun onFailure(
                                        call: Call<JsonElement>,
                                        t: Throwable
                                    ) {
                                        Log.e("ERROR", "Error:${t}")
                                        genreAdapter.removeFooterLoading()
                                    }

                                })
                            }

                            override fun isLoading(): Boolean {
                                return genreAdapter.isLoadingAdd
                            }

                            override fun isLastPage(): Boolean {
                                return genreAdapter.isLastPage()
                            }

                        })

                    } catch (e: IOException) {
                        e.printStackTrace()
                    }
                } else {
                    Log.i("Nothing", "Du lieu rong:" + response.body())
                }
            }

            override fun onFailure(call: Call<JsonElement>, t: Throwable) {
                t.printStackTrace()
                Log.e("ERROR", "Loi:${t}")
            }
        })


    }
    
}

