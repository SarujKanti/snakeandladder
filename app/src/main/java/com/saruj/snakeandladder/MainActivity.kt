package com.saruj.snakeandladder

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.saruj.snakeandladder.ui.screens.DashboardScreen
import com.saruj.snakeandladder.ui.screens.GameBoardScreen
import com.saruj.snakeandladder.ui.screens.SplashScreen
import com.saruj.snakeandladder.ui.theme.SnakeAndLadderTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "splash") {
                composable("splash")
                { SplashScreen(navController) }
                composable("dashboard")
                { DashboardScreen(navController) }
                composable("gameBoard")
                { GameBoardScreen() }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "SARUJ $name!",
        modifier = modifier
    )
}
@Preview(showBackground = true)


@Composable
fun GreetingPreview() {
    SnakeAndLadderTheme {
        Greeting("Android")
    }
}