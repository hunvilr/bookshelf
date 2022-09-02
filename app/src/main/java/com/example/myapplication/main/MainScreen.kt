package com.example.myapplication.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.bookshelf.BookShelfListItems
import com.example.myapplication.bottombar.BottomBar
import com.example.myapplication.metrics.Metrics
import com.example.myapplication.model.getBooks
import com.example.myapplication.model.getBottomBarNavItems
import com.example.myapplication.model.getMetrics
import com.example.myapplication.model.getProfile
import com.example.myapplication.profile.ProfileSection

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    Scaffold(
        bottomBar = { BottomBar(bottomBarNavItems = getBottomBarNavItems())},
        content = { padding ->
            Column(modifier = Modifier.padding(padding)) {
                ProfileSection(profile = getProfile())
                Metrics(metrics = getMetrics())
                BookShelfListItems(bookList = getBooks())
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
}