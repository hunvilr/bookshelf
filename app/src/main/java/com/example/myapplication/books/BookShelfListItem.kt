package com.example.myapplication.books

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        BookShelfListItems(bookList = getBooks())
    }
}

@Composable
fun BookShelfListItems(bookList: List<Book>) {
    LazyColumn(modifier = Modifier.fillMaxHeight()) {
        items(items = bookList, itemContent = { book ->
            Row(modifier = Modifier
                .padding(4.dp)
                .fillMaxWidth()) {
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
                        textAlign = TextAlign.Center
                    )
                }
                Spacer(
                    modifier = Modifier.weight(1f)

                )
                Text(
                    modifier = Modifier
                        .padding(end = 8.dp)
                        .align(Alignment.CenterVertically),
                    text = book.percentRead.toString(),
                    style = TextStyle(
                        fontWeight = FontWeight.Normal,
                        fontSize = 14.sp
                    ),
                    textAlign = TextAlign.Center
                )
            }
        })
    }
}

@Composable
fun BookShelfListItem1(book: Book) {
    Row(modifier = Modifier
        .padding(4.dp)
        .fillMaxWidth()) {
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
                textAlign = TextAlign.Center
            )
        }
        Spacer(
            modifier = Modifier.weight(1f)

        )
        Text(
            modifier = Modifier
                .padding(end = 8.dp)
                .align(Alignment.CenterVertically),
            text = book.percentRead.toString(),
            style = TextStyle(
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp
            ),
            textAlign = TextAlign.Center
        )
    }
}