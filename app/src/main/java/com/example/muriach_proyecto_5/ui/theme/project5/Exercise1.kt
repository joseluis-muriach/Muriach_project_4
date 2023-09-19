package com.example.muriach_proyecto_5.ui.theme.project5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Title()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Title() {
    Text(
        text = "Welcome to: 'SUM OF TWO NUMBERS'",
        textAlign = TextAlign.Center,
        style = TextStyle(
            fontSize = 20.sp),
        color = Color.Blue,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 20.dp),
    )

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {

        var inputFirstNumber by remember { mutableStateOf("") }
        var inputSecondNumber by remember { mutableStateOf("") }
        var resultOfTwoNUmbers by remember { mutableStateOf("") }

        OutlinedTextField(
            value = inputFirstNumber,
            onValueChange = { inputFirstNumber = it },
            label = {
                Text("First number")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        OutlinedTextField(
            value = inputSecondNumber,
            onValueChange = { inputSecondNumber = it },
            label = {
                Text("Second number")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        Button(
            onClick = {
                var catena = ""
                if (inputSecondNumber.length < 10)
                    catena += "Password: at least 10 characters\n"
                if (inputFirstNumber.length == 0)
                    catena += "User: empty"
                resultOfTwoNUmbers = (
                        (inputFirstNumber.toInt() +
                                inputSecondNumber.toInt()).toString())
            },
            modifier = Modifier.padding(10.dp)
        ) {
            Text(text = "Calculate")
        }

        Text(
            text = "Result: " + resultOfTwoNUmbers,
            modifier = Modifier.padding(10.dp),
            style = TextStyle(
                fontSize = 20.sp)
        )

    }
}


