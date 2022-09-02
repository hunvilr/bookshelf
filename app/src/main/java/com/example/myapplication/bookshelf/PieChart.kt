package com.example.myapplication.bookshelf

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.model.Book
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun PieChart(book: Book) {
    Canvas(
        modifier = Modifier
            .size(width = 24.dp, height = 24.dp)
    ) {
        val canvasWidth = size.width
        val canvasHeight = size.height
        drawCircle(
            color = Color.White,
            alpha = 1f,
            center = Offset(x = canvasWidth/2, y = canvasHeight/2),
            radius = canvasWidth/2,
            style = Stroke(2f)
        )

        val sweepAngle = (360 * book.percentRead) / 100

        drawArc(
            color = Color.Black,
            startAngle = 270f,
            sweepAngle = sweepAngle.toFloat(),
            useCenter = true
        )
        drawArc(
            color = Color.White,
            startAngle = 270f + sweepAngle.toFloat(),
            sweepAngle = 360 - sweepAngle.toFloat(),
            useCenter = true
        )
    }
}

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
