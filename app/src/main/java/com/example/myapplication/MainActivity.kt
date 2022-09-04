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
        window.decorView.addKeyboardInsetListener {
            Log.d("TAG", "hjr it $it")
        }
    }

    @RequiresApi(Build.VERSION_CODES.R)
    fun View.addKeyboardInsetListener(keyboardCallback: (visible: Boolean) -> Unit) {
        doOnLayout {
            //get init state of keyboard
            var keyboardVisible = rootWindowInsets?.isVisible(WindowInsets.Type.ime()) == true

            //Log.d("TAG", "hjr keyboardVisible $keyboardVisible")
            //callback as soon as the layout is set with whether the keyboard is open or not
            keyboardCallback(keyboardVisible)

            //whenever there is an inset change on the App, check if the keyboard is visible.
            setOnApplyWindowInsetsListener { _, windowInsets ->
                val keyboardUpdateCheck =
                    rootWindowInsets?.isVisible(WindowInsets.Type.ime()) == true
                //since the observer is hit quite often, only callback when there is a change.
                if (keyboardUpdateCheck != keyboardVisible) {
                    keyboardCallback(keyboardUpdateCheck)
                    keyboardVisible = keyboardUpdateCheck
                }

                windowInsets
            }
        }
    }
}