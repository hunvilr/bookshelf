package com.example.myapplication.topbar

import androidx.compose.material.Text
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

@Composable
fun TopBar() {
    CenterAlignedTopAppBar(
        navigationIcon = {
            Icon(
                painterResource(id = R.drawable.ic_baseline_table_rows_24),
                tint = Color.Black.copy(alpha = 0.8f),
                contentDescription = "My Profile"
            )
        },
        title = {
            Text(
                text = "My Profile",
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.titleSmall,
                color = Color.Black.copy(alpha = 0.8f),
                fontSize = 18.sp
            )
        },
        actions = {
            Icon(
                painterResource(id = R.drawable.ic_baseline_notifications_24),
                tint = Color.Black.copy(alpha = 0.8f),
                contentDescription = "Notifications"
            )
        },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = Color(R.color.colorPrimary).copy(.1f))
    )
}

@Preview(showBackground = true)
@Composable
fun TopAppBarPreview() {
    TopBar()
}