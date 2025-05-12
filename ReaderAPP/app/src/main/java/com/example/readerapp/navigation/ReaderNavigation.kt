package com.example.readerapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.readerapp.screens.ReaderSplashScreen
import com.example.readerapp.screens.home.Home
import com.example.readerapp.screens.login.ReaderLoginScreen
import com.example.readerapp.screens.search.ReaderBookSearchScreen
import com.example.readerapp.screens.stats.ReaderStatsScreen


@Composable
fun ReaderNavigation() {
    val navController = rememberNavController()


    NavHost(
        navController = navController,
        startDestination = ReaderScreens.SplashScreen.name
    ){
        composable(ReaderScreens.SplashScreen.name) {
            ReaderSplashScreen(navController)
        }

        composable(ReaderScreens.LoginScreen.name) {
            ReaderLoginScreen(navController)
        }

        composable(ReaderScreens.ReaderStatsScreen.name) {
            ReaderStatsScreen(navController)
        }

        composable(ReaderScreens.ReaderHomeScreen.name) {
            Home(navController)
        }

        composable(ReaderScreens.SearchScreen.name) {
            ReaderBookSearchScreen(navController)
        }

    }
}