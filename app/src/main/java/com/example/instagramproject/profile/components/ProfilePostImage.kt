package com.example.instagramproject.profile.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import coil.compose.AsyncImage

@Composable
fun ProfilePostImage(image: String, onClick: () -> Unit, modifier: Modifier = Modifier) {
    Box(modifier = modifier.clickable { onClick }) {
        AsyncImage(model = image, contentDescription = "profile post")
    }
}