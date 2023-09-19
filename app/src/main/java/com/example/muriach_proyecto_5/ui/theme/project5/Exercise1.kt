package com.example.muriach_proyecto_5.ui.theme.project5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.muriach_proyecto_5.ui.theme.Muriach_proyecto_5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Portada()
        }
    }
}

@Composable
fun Portada() {
    Text(
        text = "Suma de dos números",
        modifier = Modifier
            .fillMaxSize(),
        Color.Blue)

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Muriach_proyecto_5Theme {
        Portada()
    }
}