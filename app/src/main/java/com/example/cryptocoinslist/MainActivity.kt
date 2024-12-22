package com.example.cryptocoinslist

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.cryptocoinslist.ui.theme.CryptoCoinsListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CryptoCoinsListTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Surface(
                        modifier = Modifier
                            .background(Color(0xFF252525))
                            .padding(innerPadding)
                    ) {
                        Main()
                    }
                }
            }
        }
    }
}

@Composable
fun Main() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF252525),
    ) {
        MainScreenAppBar()
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreenAppBar() {
    Scaffold(
        contentColor = Color(0xFF252525),
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF252525),
                    titleContentColor = Color.White,
                ),
                title = {
                    Text(text = "Crypto Coins List",
                        modifier = Modifier.alpha(0.7f),
                        style = TextStyle(
                            fontSize = 25.sp,
                        )
                    )
                }
            )
        },
    ) {
    }
}