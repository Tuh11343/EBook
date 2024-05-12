package com.example.ebook.listener

import com.example.ebook.model.Book


interface IMultiBookListener {

    fun onFirstBookClick(book: Book)

    fun onSecondBookClick(book:Book)

}