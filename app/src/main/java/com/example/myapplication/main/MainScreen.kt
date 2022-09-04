package com.example.myapplication.main

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.bookshelf.BookShelfItem
import com.example.myapplication.bottombar.BottomBar
import com.example.myapplication.greeting.HelloContent
import com.example.myapplication.metrics.Metrics
import com.example.myapplication.model.getBooks
import com.example.myapplication.model.getBottomBarNavItems
import com.example.myapplication.model.getMetrics
import com.example.myapplication.model.getProfile
import com.example.myapplication.profile.ProfileSection
import com.example.myapplication.topbar.TopBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    Scaffold(
        topBar = { TopBar() },
        bottomBar = { BottomBar(bottomBarNavItems = getBottomBarNavItems())},
        content = { padding ->
            // Passing this padding is very important.
            // If the number of items increases, you will not be able to scroll to the
            // last item otherwise
            LazyColumn(
                modifier = Modifier.padding(padding)
            ) {
                item {
                    ProfileSection(profile = getProfile())
                }
                item {
                    Metrics(metrics = getMetrics())
                }
                item {
                    Metrics(metrics = getMetrics())
                }
                item {
                    Metrics(metrics = getMetrics())
                }
                item {
                    Spacer(modifier = Modifier.fillMaxWidth().padding(4.dp))
                    Text(
                        modifier = Modifier.fillMaxWidth().padding(start = 16.dp, end = 8.dp, top = 8.dp, bottom = 8.dp),
                        text = "Continue Reading",
                        style = MaterialTheme.typography.titleMedium,
                        textAlign = TextAlign.Start,
                        fontSize = 16.sp
                    )
                    Spacer(modifier = Modifier.fillMaxWidth().padding(4.dp))
                }
                items(items = getBooks(), itemContent = { book ->
                    BookShelfItem(book)
                    Divider(modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp))
                })
                item {
                    HelloContent()
                }
                item {
                    HelloContent()
                }
                item {
                    HelloContent()
                }
            }
        },
        containerColor = Color(R.color.colorPrimary).copy(.1f)
    )
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
}