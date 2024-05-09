package com.example.ebook.listener

import com.example.ebook.model.Book


interface IBookListener {

    fun onBookClick(book: Book)

}