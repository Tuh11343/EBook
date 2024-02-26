package com.example.ebook.model

class GenresResponse(var status: String, var genres:MutableList<Genre>) {

    constructor() : this("", mutableListOf())

    override fun toString(): String {
        return "Status: $status, Genre: ${genres.toString()}"
    }
}