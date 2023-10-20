package com.compose.navigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.compose.navigation.ui.screen.HomeScreen
import com.compose.navigation.ui.screen.LoginScreen

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screens.LoginScreen.route) {
        composable(route = Screens.LoginScreen.route) {
            LoginScreen(navController = navController)
        }

        composable(route = Screens.HomeScreen.route, arguments = listOf(
            navArgument(TEXT) {
                type = NavType.StringType
                defaultValue = ""
                nullable = true
            }
        )) {
            HomeScreen(it.arguments?.getString(TEXT) ?: "")
        }
    }
}