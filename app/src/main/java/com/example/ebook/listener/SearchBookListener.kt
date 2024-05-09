package com.example.ebook.listener

import com.example.ebook.model.Book


interface SearchBookListener {

    fun onBookClick(book: Book)

}