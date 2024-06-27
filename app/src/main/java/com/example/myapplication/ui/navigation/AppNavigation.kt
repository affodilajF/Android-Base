package com.example.myapplication.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

@Composable
fun AppNavigationGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Routes.FIRST_SCREEN) {
        composable(Routes.FIRST_SCREEN) {
        }
    }
}