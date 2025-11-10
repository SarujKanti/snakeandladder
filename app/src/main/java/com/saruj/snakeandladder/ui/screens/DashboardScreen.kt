package com.saruj.snakeandladder.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun DashboardScreen(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Main Dashboard",

                fontSize = 28.sp,

                modifier = Modifier.padding(bottom = 32.dp)
            )
            Button(
                onClick = { navController.navigate("gameBoard") },
                modifier = Modifier.padding(8.dp)
            )
            {
                Text("🎮 Start Game")
            }
            Button(
                onClick = { /* TODO: Rules Screen */ },
                modifier = Modifier.padding(8.dp)
            ) {
                Text("📜 Rules")
            }

            Button(
                onClick = { /* TODO: Exit or Settings */ },
                modifier = Modifier.padding(8.dp)
            )
            {
                Text("⚙️ Exit / Settings")
            }
        }
    }
}