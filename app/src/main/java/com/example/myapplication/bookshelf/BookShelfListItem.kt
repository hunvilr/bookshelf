package com.example.myapplication.bookshelf

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.model.Book
import com.example.myapplication.model.getBooks
import com.example.myapplication.ui.theme.MyApplicationTheme


@Preview(showBackground = true)
@Composable
fun BookShelfListItemsPreview() {
    MyApplicationTheme {
        BookShelfListItems(bookList = getBooks())
    }
}

@Composable
fun BookShelfListItems(bookList: List<Book>) {
    Column(modifier = Modifier.padding(8.dp)) {
        Text(
            text = "Continue Reading",
            style = MaterialTheme.typography.titleMedium,
            textAlign = TextAlign.Start,
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.fillMaxWidth().padding(4.dp))
        LazyColumn(modifier = Modifier.fillMaxHeight()) {
            items(items = bookList, itemContent = { book ->
                BookShelfItem(book)
                Divider(modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp))
            })
        }
    }
}

@Composable
fun BookShelfItem(book: Book) {
    Row(modifier = Modifier
        .padding(4.dp)
        .fillMaxWidth()
        .height(IntrinsicSize.Max)) {
        val image: Painter = painterResource(id = book.bookImage)
        Image(
            modifier = Modifier
                .size(width = 50.dp, height = 80.dp)
                .padding(start = 8.dp, top = 4.dp, bottom = 4.dp),
            painter = image,
            contentDescription = "",
            alignment = Alignment.Center
        )
        Spacer(
            modifier = Modifier.padding(8.dp)
        )
        Column(modifier = Modifier.align(Alignment.CenterVertically)) {
            Text(
                text = book.bookTitle,
                style = MaterialTheme.typography.titleMedium,
                textAlign = TextAlign.Center
            )
            Text(
                text = book.bookSubTitle,
                style = MaterialTheme.typography.bodyMedium,
                textAlign = TextAlign.Center,
                color = Color.Gray
            )
        }
        Spacer(
            modifier = Modifier.weight(1f)

        )
        Column(
            modifier = Modifier
                .width(100.dp)
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.weight(0.5f),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.Bottom

            ) {
                Text(
                    modifier = Modifier
                        .padding(bottom = 8.dp),
                    text = book.percentRead.toString() + "%",
                    style = TextStyle(
                        fontWeight = FontWeight.Normal,
                        fontSize = 16.sp
                    ),
                    textAlign = TextAlign.Center,
                    color = Color.DarkGray
                )
            }
            /**
             * 100 book.percentRead
             * 360 ?
             *
             * sweepAngle = (360 * book.percentRead) / 100
             */
            Row(
                modifier = Modifier.weight(0.5f),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.Top
            ) {
                PieChart(book)
            }
        }
    }
}