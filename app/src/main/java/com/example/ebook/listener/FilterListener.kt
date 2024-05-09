package com.example.ebook.listener

import com.example.ebook.model.Genre


interface FilterListener {

    fun onGenreClick(genre: Genre?)

}