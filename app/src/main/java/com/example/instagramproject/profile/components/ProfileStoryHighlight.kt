package com.example.instagramproject.profile.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.instagramproject.profile.Story

@Composable
fun ProfileStoryHighlight(
    onClick: () -> Unit,
    stories: List<Story>,
    modifier: Modifier = Modifier
) {
    LazyRow(modifier = modifier
    ) {
        items(stories) {
            StoryItem(story = it, modifier = modifier.clickable { onClick })
            Spacer(modifier = Modifier.width(8.dp))
        }
    }
}

@Composable
private fun StoryItem(
    story: Story,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        AsyncImage(
            model = story.image,
            contentDescription = "story img",
            modifier = Modifier.clip(CircleShape)
        )
        Text(text = story.text)
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileStoryHighlightPreview() {
    ProfileStoryHighlight({}, emptyList())
}