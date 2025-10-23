package com.saruj.snakeandladder.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun GameBoardScreen() {
    val boardSize = 10
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Snake & Ladder Board",
            fontSize = 24.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Column {
            for (row in boardSize downTo 1) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    val isEvenRow = row % 2 == 0
                    val start = (row - 1) * boardSize + 1
                    val end = row * boardSize
                    val numbers = if (isEvenRow) (start..end).toList() else (start..end).toList().reversed()

                    numbers.forEach { number ->
                        Box(
                            modifier = Modifier
                                .size(36.dp)
                                .border(1.dp, Color.Gray)
                                .background(if (number % 2 == 0) Color(0xFFE3F2FD) else Color(0xFFFFF9C4)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = number.toString(),
                                fontSize = 12.sp,
                                color = MaterialTheme.colorScheme.onBackground
                            )
                        }
                    }
                }
            }
        }
    }
}