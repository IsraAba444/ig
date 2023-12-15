package com.example.instagramproject.profile.components

import android.accounts.AuthenticatorDescription
import android.provider.ContactsContract.Profile
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ProfileDescription(
    name: String,
    description: String,
    modifier: Modifier = Modifier
) {
  Column(modifier = modifier.fillMaxWidth()) {
      Text(text = name, fontWeight = FontWeight.Bold)
      Text(text = description)
  }  
}

@Preview
@Composable
fun ProfileDescriptionPreview() {
    ProfileDescription("Isra CT", "Description")
}