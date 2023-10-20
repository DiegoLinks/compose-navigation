package com.compose.navigation.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.compose.navigation.data.User
import com.compose.navigation.data.userDefault
import com.compose.navigation.ui.theme.NavigationTheme

@Composable
fun HomeScreen(user: User) {
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()) {
        Text(text = "Você está na tela Home", modifier = Modifier.padding(top = 16.dp))

        Text(
            text = "Olá, ${user.name}!",
            fontSize = 18.sp,
            modifier = Modifier.padding(top = 16.dp)
        )

        Text(
            text = "\"${user.bio}\"",
            modifier = Modifier
                .padding(top = 16.dp)
                .padding(horizontal = 24.dp),
            fontSize = 16.sp,
            textAlign = TextAlign.Center
        )

        Text(
            text = "E-mail: ${user.email}",
            modifier = Modifier.padding(top = 16.dp),
            fontSize = 16.sp
        )

        Text(
            text = "Inicio: ${user.registerDate}",
            modifier = Modifier.padding(top = 4.dp),
            fontSize = 16.sp
        )

        Text(
            text = "Pontuação: ${user.score}/100",
            modifier = Modifier.padding(top = 4.dp),
            fontSize = 16.sp
        )

        Text(text = "Idade: ${user.age}", modifier = Modifier.padding(top = 4.dp), fontSize = 16.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    NavigationTheme {
        HomeScreen(user = userDefault)
    }
}