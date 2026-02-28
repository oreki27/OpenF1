package com.oreki.openf1.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.oreki.openf1.presentation.home.HomeScreen
import com.oreki.openf1.presentation.user.UserScreen

@Composable
fun AppNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen()
        }
        composable("user/{userId}") {
            UserScreen()
        }
    }
}