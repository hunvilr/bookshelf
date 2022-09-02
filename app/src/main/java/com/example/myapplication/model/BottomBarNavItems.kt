package com.example.myapplication.model

import com.example.myapplication.R

fun getBottomBarNavItems(): List<NavigationItem> {
    return listOf(
        NavigationItem(R.drawable.ic_baseline_home_24, "Home"),
        NavigationItem(R.drawable.ic_baseline_search_24, "Search"),
        NavigationItem(R.drawable.ic_baseline_favorite_24, "Favorite"),
        NavigationItem(R.drawable.ic_baseline_bar_chart_24, "Progress"),
        NavigationItem(R.drawable.ic_baseline_person_24, "Account"),
    )
}

data class NavigationItem(
    val icon: Int,
    val iconTitle: String
)