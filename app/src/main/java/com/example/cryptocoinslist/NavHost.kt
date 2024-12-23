package com.example.cryptocoinslist

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavHost() {
    val navController = rememberNavController()
    
    NavHost(
        navController = navController,
        startDestination = "main"
    ) {
        composable("main") { MainScreenList(navController)}
        composable("details") { DetailsScreen(navController) }
    }
}


