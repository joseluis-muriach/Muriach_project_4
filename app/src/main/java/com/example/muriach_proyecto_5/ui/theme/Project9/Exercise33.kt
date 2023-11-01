package com.example.muriach_proyecto_5.ui.theme.Project9

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
In this exercise, when we enter a number the program show the result sum and your average.
*/

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Exercise33(navController: NavController) {
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

        Row(Modifier.fillMaxWidth()) {
            Text(text = "When introduce three numbers, the program return your sum and average",
                modifier = Modifier.padding(5.dp))
        }

        var inputNumberA by remember { mutableStateOf("") }
        var inputNumberB  by remember { mutableStateOf("") }
        var inputNumberC by remember { mutableStateOf("") }
        var resultSum by remember { mutableStateOf("") }
        var resultAverage by remember { mutableStateOf("") }
        var textResult by remember { mutableStateOf("") }

        OutlinedTextField(
            value = inputNumberA,
            onValueChange = { inputNumberA = it },
            label = {
                Text("Introduce a number: ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        OutlinedTextField(
            value = inputNumberB,
            onValueChange = { inputNumberB = it },
            label = {
                Text("Introduce a number: ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        OutlinedTextField(
            value = inputNumberC,
            onValueChange = { inputNumberC = it },
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
                resultSum = (inputNumberA.toInt() +
                        inputNumberB.toInt() + inputNumberC.toInt()).toString()
                textResult = "The result of the sum is: $resultSum \n"

                resultAverage = (resultSum.toFloat() / 3).toString()
                textResult += "The result of the average is $resultAverage"

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
            onClick = { navController.navigate("CoverP9") },
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.End),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black)

        ) {
            Text(text = "Previous",
                color = Color.White
            )
        }
    }
}

