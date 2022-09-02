package com.example.myapplication.model

data class Metrics(
    val numberOfHours: Int,
    val numberOfBooks: Int,
    val numberOfAuthors: Int
)

fun getMetrics() = Metrics(
    numberOfHours = 928,
    numberOfBooks = 129,
    numberOfAuthors = 100
)
