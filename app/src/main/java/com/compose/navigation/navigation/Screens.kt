package com.compose.navigation.navigation

import com.compose.navigation.navigation.Routes.HOME_ROUTE
import com.compose.navigation.navigation.Routes.LOGIN_ROUTE

sealed class Screens(val route: String) {
    object LoginScreen : Screens(LOGIN_ROUTE)
    object HomeScreen : Screens(HOME_ROUTE)
}