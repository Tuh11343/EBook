package com.example.ebook.model

class GenreResponse(var status: String, var genre: Genre) {

    constructor() : this("", Genre())

    override fun toString(): String {
        return "Status: $status, Genre: ${genre.toString()}"
    }
}