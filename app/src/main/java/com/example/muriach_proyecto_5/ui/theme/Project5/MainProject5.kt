package com.example.muriach_proyecto_5.ui.theme.Project5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Exercise_1_5()
//            // A surface container using the 'background' color from the theme
//            Surface(
//                modifier = Modifier.fillMaxSize()
//            )
//            {
//                val navController = rememberNavController()
//                NavHost(navController = navController, startDestination = "Cover") {
//                    composable("Cover") { MainProject4(navController) }
//                    composable("Exercise1") { com.example.muriach_proyecto_5.ui.theme.Project4.Exercise1(navController) }
//                    composable("Exercise2") { Exercise_2(navController) }
//                    composable("Exercise3") { Exercise3(navController) }
//                    composable("Exercise4") { Exercise4(navController) }
//                }
//            }
        }
    }
}