package com.compose.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.compose.navigation.ui.screen.HomeScreen
import com.compose.navigation.ui.screen.LoginScreen
import com.compose.navigation.ui.theme.NavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationTheme {

                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "login") {
                    composable(route = "login") {
                        LoginScreen(navController = navController)
                    }

                    composable(route = "home/{text}", arguments = listOf(
                        navArgument("text") {
                            type = NavType.StringType
                            defaultValue = ""
                            nullable = true
                        }
                    )) {
                        HomeScreen(it.arguments?.getString("text") ?: "")
                    }
                }
            }
        }
    }
}