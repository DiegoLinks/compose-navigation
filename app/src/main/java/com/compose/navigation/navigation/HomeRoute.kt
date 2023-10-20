package com.compose.navigation.navigation

import androidx.compose.runtime.Composable
import com.compose.navigation.data.getUserData
import com.compose.navigation.ui.screen.HomeScreen

@Composable
fun HomeRoute(userName: String) {
    val user = getUserData(userName = userName)

    HomeScreen(user = user)
}