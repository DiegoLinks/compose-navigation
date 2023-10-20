package com.compose.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun LoginScreen(navController: NavController){
    Column {
        Text(text = "Você está na tela de login")
        
        Button(onClick = {
            navController.navigate("home")
        }) {
            Text(text = "Navegar para Home")
        }
    }

}