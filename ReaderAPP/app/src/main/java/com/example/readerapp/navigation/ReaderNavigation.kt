package com.example.readerapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.readerapp.screens.ReaderSplashScreen
import com.example.readerapp.screens.home.ReaderHomeScreen
import com.example.readerapp.screens.login.ReaderLoginScreen


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

        composable(ReaderScreens.ReaderHomeScreen.name) {
            ReaderHomeScreen(navController)
        }

    }
}