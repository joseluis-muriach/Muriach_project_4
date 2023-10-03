package com.example.muriach_proyecto_5.ui.theme.Project4

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
In this exercise we are going to see the sum of two input numbers
*/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Exercise5(navController: NavController) {
    Text(
        text = "Welcome to: 'SUM OF TWO NUMBERS'",
        textAlign = TextAlign.Center,
        style = TextStyle(
            fontSize = 20.sp
        ),
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

        //Declaration of variables
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
                //Calculate the sum of two numbers when push the buttom
                resultOfTwoNUmbers = ((inputFirstNumber.toFloat() +
                        inputSecondNumber.toFloat()).toString())
            },
            modifier = Modifier.padding(10.dp)
        ) {
            Text(text = "Calculate")
        }

        Text(
            text = "Result: " + resultOfTwoNUmbers,
            modifier = Modifier.padding(10.dp),
            style = TextStyle(
                fontSize = 20.sp
            )
        )

        //This button allows to go to "Cover" (also in Exercises 2,3 and 4)
        Button(
            onClick = {navController.navigate("CoverP4")},
            modifier = Modifier.padding(10.dp)
                .align(Alignment.End)

        ) {
            Text(text = "Previous")
        }
    }
}


