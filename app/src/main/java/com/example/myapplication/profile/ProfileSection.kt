package com.example.myapplication.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.model.Profile
import com.example.myapplication.model.getProfile

@Composable
fun ProfileSection(profile: Profile, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.padding(start = 8.dp),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            painter = painterResource(id = profile.image),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(8.dp)
                .size(64.dp)
                .clip(CircleShape)
        )
        Column(
            modifier = modifier
                .padding(8.dp)
        ) {
            Text(
                text = "Welcome back,",
                style = MaterialTheme.typography.bodySmall
            )
            Text(
                text = profile.profileName,
                style = MaterialTheme.typography.titleLarge
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileSectionPreview() {
    ProfileSection(getProfile())
}