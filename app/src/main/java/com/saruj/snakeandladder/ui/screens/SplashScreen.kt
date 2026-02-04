package com.saruj.snakeandladder.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    LaunchedEffect(Unit) {
        delay(3000) // 3 seconds
        navController.navigate("dashboard") {
            popUpTo("splash") { inclusive = true }
        }
    }
    Box(
        modifier = Modifier.fillMaxSize(),

        contentAlignment = Alignment.Center
    )
    {
        Text(
            text = "🐍 Snake & Ladder 🎲",
            fontSize = 40.sp,

            fontWeight = FontWeight.ExtraBold
        )
    }
}