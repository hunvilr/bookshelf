package com.example.myapplication.model

data class Metrics(
    val numberOfHours: Int,
    val numberOfBooks: Int,
    val numberOfAuthors: Int
)

fun getMetrics() = Metrics(
    numberOfHours = 111,
    numberOfBooks = 222,
    numberOfAuthors = 333
)
