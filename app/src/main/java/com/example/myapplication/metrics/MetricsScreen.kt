package com.example.myapplication.metrics

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.model.Metrics
import com.example.myapplication.model.getMetrics

@Composable
fun Metrics(metrics: Metrics, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        MetricsTitle()
        MetricsData(metrics)
    }
}

@Preview(showBackground = true)
@Composable
fun MetricsPreview() {
    Metrics(getMetrics())
}

@Composable
fun MetricsTitle() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
       Column(
           modifier = Modifier
               .weight(0.5f)
       ) {
           Text(
               text = "Shelf is all about you read.",
               style = MaterialTheme.typography.bodyMedium,
               fontSize = 14.sp,
               color = Color.DarkGray
           )
           Text(
               text = "Try and enjoy.",
               style = MaterialTheme.typography.bodyMedium,
               fontSize = 14.sp,
               color = Color.DarkGray
           )
       }

       Row(
           modifier = Modifier
               .size(width = 150.dp, height = 30.dp)
               .clip(RoundedCornerShape(25.dp))
               .background(Color(231, 149, 105))
               .padding(end = 8.dp),
           horizontalArrangement = Arrangement.Center,
           verticalAlignment = Alignment.CenterVertically
       ) {
           Image(
               painter = painterResource(id = R.drawable.ic_baseline_settings_24),
               contentDescription = "",
               colorFilter = ColorFilter.tint(Color.White),
               modifier = Modifier.size(15.dp)
           )
           Text(
               text = "SMART PICKER",
               style = MaterialTheme.typography.titleSmall,
               color = Color.White,
               fontSize = 12.sp
           )
       }
    }
}

@Composable
fun MetricsData(metrics: Metrics) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(Color.White),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier.padding(20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = metrics.numberOfHours.toString(),
                style = MaterialTheme.typography.titleSmall,
                color = Color.Black,
                fontSize = 24.sp
            )
            Text(
                text = "Hours",
                style = MaterialTheme.typography.labelSmall,
                color = Color.Gray,
                fontSize = 12.sp
            )
        }
        Column(
            modifier = Modifier.padding(20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = metrics.numberOfBooks.toString(),
                style = MaterialTheme.typography.titleSmall,
                color = Color.Black,
                fontSize = 24.sp
            )
            Text(
                text = "Books",
                style = MaterialTheme.typography.titleSmall,
                color = Color.Gray,
                fontSize = 12.sp
            )
        }
        Column(
            modifier = Modifier.padding(20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = metrics.numberOfAuthors.toString(),
                style = MaterialTheme.typography.titleSmall,
                color = Color.Black,
                fontSize = 24.sp
            )
            Text(
                text = "Authors",
                style = MaterialTheme.typography.titleSmall,
                color = Color.Gray,
                fontSize = 12.sp
            )
        }
    }
}