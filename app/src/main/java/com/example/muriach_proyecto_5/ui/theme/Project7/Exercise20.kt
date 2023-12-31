package com.example.muriach_project_7

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

/*
This program when you introduce a number tell if the number is positive, negative or null
*/

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Exercise20(navController: NavController) {
    Text(
        text = "Welcome to: \n 'PROBLEM N.3'",
        textAlign = TextAlign.Center,
        style = TextStyle(
            fontSize = 30.sp
        ),
        color = Color.Gray,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 20.dp),
    )
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {

        Text(text = "When you enter a number i will tell you if is positive, negative or null",
            modifier = Modifier.padding(10.dp))

        var firstNumber by remember { mutableStateOf("") }
        var textResult by remember { mutableStateOf("") }

        OutlinedTextField(
            value = firstNumber,
            onValueChange = { firstNumber = it },
            label = {
                Text("Introduce a number: ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        Button(
            onClick = {
                if (firstNumber.toInt() > 0) {
                    textResult = "The number $firstNumber is positive"

                } else if (firstNumber.toInt() < 0) {
                    textResult = "The number $firstNumber is negative"
                } else {
                    textResult = "The result $firstNumber is null"
                }
            },
            modifier = Modifier.padding(10.dp)
        ) {

            Text(text = "Calculate")
        }

        Text(
            text = textResult,
            modifier = Modifier.padding(10.dp),
            style = TextStyle(
                fontSize = 20.sp
            )
        )

        //This button allows to go to "Cover" (also in Exercises 2,3 and 4)
        Button(
            onClick = {navController.navigate("CoverP7")},
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.End),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Yellow)

        ) {
            Text(text = "Previous",
                color = Color.Black)
        }
    }
}