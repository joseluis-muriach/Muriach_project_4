package com.example.muriach_proyecto_5.ui.theme.Project11

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
In this exercise when introduce 10 numbers (of a one in a one) the program will tell you
the quantity of negative numbers, positives, multiple of 15 and the sum of the pair numbers
*/

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Exercise58(navController: NavController) {
    Text(
        text = "Welcome to: \n 'PROBLEM N.12'",
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
            Text(
                text = "Enter 10 numbers one at a time",
                modifier = Modifier.padding(5.dp)
            )
        }

        var inputNumbers by remember { mutableStateOf("") }
        var quantityNegativeValues by remember { mutableStateOf(0) }
        var quantityPositiveNumbers by remember { mutableStateOf(0) }
        var quantityMultFiveteenth by remember { mutableStateOf(0) }
        var resultPairNumbers by remember { mutableStateOf(0) }
        var quantityNumbers by remember { mutableStateOf(0) }
        var textResult by remember { mutableStateOf("") }


        OutlinedTextField(
            value = inputNumbers,
            onValueChange = { inputNumbers = it },
            label = {
                Text("Introduce ten numbers ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        Button(
            onClick = {
                if (inputNumbers.toInt() < 0) {
                    quantityNegativeValues++
                } else {
                    quantityPositiveNumbers++
                }
                if (inputNumbers.toInt() % 15 == 0) {
                    quantityMultFiveteenth++
                }
                if (inputNumbers.toInt() % 2 == 0) {
                    resultPairNumbers += inputNumbers.toInt()
                }
                quantityNumbers++

                if (quantityNumbers == 10) {
                    inputNumbers = ""
                    textResult =
                        "Quantity negative numbers: $quantityNegativeValues\n" +
                                "Quantity positive numbers: $quantityPositiveNumbers\n" +
                                "Quantity multiple of 15: $quantityMultFiveteenth\n" +
                                "Result of pair numbers sum: $resultPairNumbers"
                } else {
                   inputNumbers = ""
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

        //This button allows to go to "Cover" (also in all Exercises)
        Button(
            onClick = { navController.navigate("CoverP11") },
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.End),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Green)

        ) {
            Text(
                text = "Previous",
                color = Color.Black
            )
        }
    }
}

