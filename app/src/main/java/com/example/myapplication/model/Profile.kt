package com.example.myapplication.model

import com.example.myapplication.R

data class Profile(
    val image: Int,
    val profileName: String
)

fun getProfile() = Profile(
    image = R.drawable.tom_hanks,
    profileName = "John Sortino"
)