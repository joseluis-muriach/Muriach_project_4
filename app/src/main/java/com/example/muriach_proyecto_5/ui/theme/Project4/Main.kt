package com.example.muriach_proyecto_5.ui.theme.Project4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier


import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

/*
In "Main" in "setContent" we must write our function so we can to run our program
*/
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // A surface container using the 'background' color from the theme
            Surface(
                modifier = Modifier.fillMaxSize()
            )
            {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "Cover") {
                    composable("Cover") { MainProject4(navController) }
                    composable("Exercise1") { Exercise1(navController)}
                    composable("Exercise2") { Exercise2(navController) }
                    composable("Exercise3") { Exercise3(navController) }
                    composable("Exercise4") { Exercise4(navController) }
                }
            }
        }
    }
}
