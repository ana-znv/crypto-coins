package com.example.cryptocoinslist.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun CryptoCoinScreen(navController: NavController) {
    Scaffold(
        modifier = Modifier.fillMaxHeight(0.1f),
        containerColor = Color(0xFF252525)
    ) {
        Row(
            modifier = Modifier
                .background(Color(0xFF323232))
                .fillMaxWidth()
                .fillMaxHeight(0.1f)
                .padding(start = 10.dp, top = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = {
                navController.popBackStack()
            }) {
                Icon(
                    imageVector = Icons.Filled.KeyboardArrowLeft,
                    contentDescription = "Return",
                    tint = Color.White,
                    modifier = Modifier.size(45.dp)
                        .alpha(0.8f)
                )
            }
            Text(
                text = "Bitcoin",
                modifier = Modifier.padding(start = 8.dp)
                    .alpha(0.8f),
                style = TextStyle(
                    fontSize = 30.sp,
                    color = Color.White
                )
            )
        }
    }
}