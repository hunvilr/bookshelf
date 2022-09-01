package com.example.myapplication.books

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun PieChart(
    points: List<Float>,
    colors: List<Color>
) {
    Canvas(
        modifier = Modifier
            .size(width = 100.dp, height = 100.dp)
            //.fillMaxSize()
            //.background(Color.LightGray)
    ) {
        val canvasWidth = size.width
        val canvasHeight = size.height
        drawCircle(
            color = Color.Black,
            center = Offset(x = canvasWidth/2, y = canvasHeight/2),
            radius = canvasWidth/2,
            style = Stroke(2f)
        )
        drawArc(
            color = Color.Black,
            startAngle = 0f,
            sweepAngle = 90f,
            useCenter = true
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PieChartPreview() {
    MyApplicationTheme {
        PieChart(points = listOf(25f, 35f), colors = listOf(Color.Red, Color.Blue))
    }
}
