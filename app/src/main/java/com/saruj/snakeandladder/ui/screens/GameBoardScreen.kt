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

    // Define 4 colors for alternating pattern
    val boxColors = listOf(
        Color(0xFFE3F2FD), // light blue
        Color(0xFFFFF9C4), // light yellow
        Color(0xFFC8E6C9), // light green
        Color(0xFFFFCDD2)  // light pink
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(17.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Snake & Ladder Board", //game name
            fontSize = 25.sp,
            modifier = Modifier.padding(bottom = 17.dp)
        )

        Column {
            for (row in boardSize downTo 1) { // start from top
                val isEvenRow = row % 2 == 0
                val start = (row - 1) * boardSize + 1
                val end = row * boardSize
                val numbers = if (isEvenRow) (start..end).toList().reversed() else (start..end).toList()

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    numbers.forEachIndexed { index, number ->
                        val colorIndex = (number - 1) % boxColors.size
                        Box(
                            modifier = Modifier
                                .size(36.dp)
                                .border(1.dp, Color.Gray)
                                .background(boxColors[colorIndex]),
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
