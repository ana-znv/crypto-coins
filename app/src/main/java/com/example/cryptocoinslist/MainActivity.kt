package com.example.cryptocoinslist

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
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
        Column {
            MainScreenList()
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreenList() {
    Column {
        Scaffold(
            modifier = Modifier.fillMaxHeight(0.1f),
            topBar = {
                TopAppBar(
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = Color(0xFF323232),
                        titleContentColor = Color.White,
                    ),
                    title = {
                        Text(
                            text = "Crypto Coins List",
                            modifier = Modifier.alpha(0.7f),
                            style = TextStyle(
                                fontSize = 30.sp,
                            )
                        )
                    }
                )
            },
        ) {
        }
        LazyColumn {
            items(15) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { },
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        modifier = Modifier
                            .alpha(0.8f)
                            .padding(
                                vertical = 20.dp,
                                horizontal = 15.dp
                            )
                    ) {
                        Text(
                            text = "Bitcoin",
                            style = TextStyle(
                                color = Color.White,
                                fontSize = 30.sp
                            )
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            modifier = Modifier
                                .alpha(0.7f)
                                .padding(horizontal = 4.dp),
                            text = "$100000",
                            style = TextStyle(
                                color = Color.White,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                    }
                    Icon(
                        modifier = Modifier
                            .padding(end = 10.dp)
                            .size(45.dp)
                            .alpha(0.7f),
                        imageVector = Icons.Filled.KeyboardArrowRight,
                        contentDescription = "Next",
                        tint = Color.White,
                    )
                }
                HorizontalDivider(

                    thickness = 2.dp,
                    color = Color(0xFF4D4C4C),
                    modifier = Modifier.padding(horizontal = 10.dp)
                )
            }
        }
    }
}