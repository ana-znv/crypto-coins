package com.example.cryptocoinslist

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.cryptocoinslist.routes.AppNavHost

@Composable
fun Main() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF252525),
    ) {
        AppNavHost()
    }
}