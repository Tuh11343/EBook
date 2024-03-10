package com.example.ebook.views

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ebook.adapter.GenreAdapter
import com.example.ebook.databinding.MainBinding
import com.example.ebook.model.Genre
import com.example.ebook.viewmodels.GenreViewModel
import com.example.ebook.utils.PaginationScrollListener


class MainActivity : ComponentActivity() {
    private lateinit var binding: MainBinding
    private lateinit var genreAdapter: GenreAdapter
    private lateinit var genreViewModel: GenreViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = MainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        genreViewModel = ViewModelProvider(this)[GenreViewModel::class.java]
        genreViewModel.firstLoadGenreList(12, 0)

        firstLoadGenreList()
        loadMoreGenreList()
    }


    private fun firstLoadGenreList() {
        genreViewModel.firstLoadGenreList.observe(this) { genreList ->
            run {
                if (genreList != null && genreList.size != 0) {
                    val test = mutableListOf<Genre>()
                    test.addAll(genreList)
                    genreAdapter = GenreAdapter(test)
                    binding.genreList.layoutManager =
                        LinearLayoutManager(
                            this@MainActivity,
                            LinearLayoutManager.VERTICAL,
                            false
                        )
                    binding.genreList.adapter = genreAdapter
                } else {
                    Toast.makeText(this, "Call api error", Toast.LENGTH_SHORT).show()
                }

            }
        }

        //Create Scrolling
        genreViewModel.length.observe(this) { length ->
            run {
                binding.genreList.addOnScrollListener(object :
                    PaginationScrollListener(binding.genreList.layoutManager as LinearLayoutManager) {
                    override fun loadMoreItem() {
                        genreViewModel.loadMoreGenreList(2, genreAdapter.genreList.size - 1)
                    }

                    override fun isLoading(): Boolean {
                        return genreAdapter.isLoadingAdd
                    }

                    override fun isLastPage(): Boolean {
                        return genreAdapter.genreList.size == length
                    }

                })
            }
        }

    }

    private fun loadMoreGenreList() {
        genreViewModel.loadMoreGenreList.observe(this) { genreList ->
            run {
                if (genreList != null && genreList.size != 0) {
                    genreAdapter.addFooterLoading()
                    val handler = Handler(Looper.getMainLooper())

                    val runnable = Runnable {
                        genreAdapter.removeFooterLoading()
                        genreAdapter.genreList.addAll(genreList)
                        genreAdapter.updateUI(2)
                    }

                    handler.postDelayed(runnable, 2000)
                } else {
                    Toast.makeText(this, "Call api error", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }


}

