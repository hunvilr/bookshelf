package com.example.myapplication.model

import com.example.myapplication.R

fun getBooks(): List<Book> =
    listOf<Book>(
        Book(
            R.drawable.diary,
            "Diary of an Awesome Friendly Kid",
            "Jeff Kinney",
            62
        ),
        Book(
            R.drawable.atlas,
            "Atlas shrugged",
            "Ayn Rand",
            45
        )
    )


data class Book(
    val bookImage: Int,
    val bookTitle: String,
    val bookSubTitle: String,
    val percentRead: Int
)
