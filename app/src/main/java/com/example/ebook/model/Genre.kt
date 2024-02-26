package com.example.ebook.model
class Genre(var id: Int, var name: String) {
    constructor(): this(-1, "")

    override fun toString(): String {
        return "ID: $id, Name: $name"
    }
}