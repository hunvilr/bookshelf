package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.myapplication.bookshelf.BookShelfListItems
import com.example.myapplication.metrics.Metrics
import com.example.myapplication.model.getBooks
import com.example.myapplication.model.getMetrics
import com.example.myapplication.model.getProfile
import com.example.myapplication.profile.ProfileSection
import com.example.myapplication.ui.theme.MyApplicationTheme

/**
 * https://dribbble.com/shots/18526342-Mobile-App-iOS-Android-UI
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(223, 231, 238)//MaterialTheme.colorScheme.background
                ) {
                    Column {
                        ProfileSection(profile = getProfile())
                        Metrics(metrics = getMetrics())
                        BookShelfListItems(bookList = getBooks())
                    }
                }
            }
        }
    }
}