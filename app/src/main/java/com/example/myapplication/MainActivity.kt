package com.example.myapplication

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.WindowInsets
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.core.view.doOnLayout
import com.example.myapplication.main.MainScreen
import com.example.myapplication.ui.theme.MyApplicationTheme

/**
 * https://dribbble.com/shots/18526342-Mobile-App-iOS-Android-UI
 *
 * Colors
 * https://convertingcolors.com/rgb-color-208_226_219.html?search=RGB(208,226,219)
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = colorResource(id = R.color.colorPrimary) //Color(221, 231, 227)//MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}