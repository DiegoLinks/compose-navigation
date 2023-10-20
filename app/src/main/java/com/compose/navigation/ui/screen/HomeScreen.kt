package com.compose.navigation.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.compose.navigation.ui.theme.NavigationTheme

@Composable
fun HomeScreen(text: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()) {
        Text(text = "Você está na tela Home", modifier = Modifier.padding(16.dp))

        Text(text = "Olá, $text", modifier = Modifier.padding(16.dp), fontSize = 18.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    NavigationTheme {
        HomeScreen(text = "Você")
    }
}