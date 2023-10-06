package com.example.muriach_proyecto_5.ui.theme.Project8

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
In this exercise, when we enter three numbers, the program will tell you if they are less than 10
*/

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Exercise27(navController: NavController) {
    Text(
        text = "Welcome to: \n 'PROBLEM N.5'",
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

        Row(Modifier.fillMaxWidth()) {
            Text(text = "The program, when you introduce the three numbers, will tell you" +
                    " if all numbers are less than 10",
                modifier = Modifier.padding(5.dp))
        }

        var firstNumber by remember { mutableStateOf("") }
        var secondNumber by remember { mutableStateOf("") }
        var thirdNumber by remember { mutableStateOf("") }
        var textResult by remember { mutableStateOf("") }

        OutlinedTextField(
            value = firstNumber,
            onValueChange = { firstNumber = it },
            label = {
                Text("Introduce the first number: ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        OutlinedTextField(
            value = secondNumber,
            onValueChange = { secondNumber = it },
            label = {
                Text("Introduce the second number: ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        OutlinedTextField(
            value = thirdNumber,
            onValueChange = { thirdNumber = it },
            label = {
                Text("Introduce the third: ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        Button(
            onClick = {
                if (firstNumber.toInt() < 10 && secondNumber.toInt() <10 &&
                    thirdNumber.toInt() < 10) {
                    textResult = "All numbers are less than 10"

                } else {
                    textResult = "Some number isn't less than 10"
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
            onClick = {navController.navigate("CoverP8")},
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.End),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)

        ) {
            Text(text = "Previous")
        }
    }
}