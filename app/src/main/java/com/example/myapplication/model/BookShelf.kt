package com.example.myapplication.model

import com.example.myapplication.R

fun getBooks(): List<Book> =
    listOf<Book>(
        Book(
            R.drawable.goldfinch,
            "The Goldfinch",
            "Donna Tartt",
            62
        ),
        Book(
            R.drawable.die_verwandlung,
            "Die Verwandlung",
            "Franz Kafka",
            45
        )
    )


data class Book(
    val bookImage: Int,
    val bookTitle: String,
    val bookSubTitle: String,
    val percentRead: Int
)
