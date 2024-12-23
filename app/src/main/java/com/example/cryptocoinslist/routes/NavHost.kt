package com.example.cryptocoinslist.routes

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cryptocoinslist.screens.CryptoCoinScreen
import com.example.cryptocoinslist.screens.CryptoCoinsList

@Composable
fun AppNavHost() {
    val navController = rememberNavController()
    
    NavHost(
        navController = navController,
        startDestination = "main"
    ) {
        composable("main") { CryptoCoinsList(navController) }
        composable("details") { CryptoCoinScreen(navController) }
    }
}


