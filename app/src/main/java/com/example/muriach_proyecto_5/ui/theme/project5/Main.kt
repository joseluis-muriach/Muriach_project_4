package com.example.muriach_proyecto_5.ui.theme.project5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

/*
In "Main" in "setContent" we must write our function so we can see our program
*/
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //Exercise1()
            //Exercise_2()
            MainBuyProduct()
        }
    }
}