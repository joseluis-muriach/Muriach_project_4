package com.example.muriach_proyecto_5.ui.theme.Project14

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
This program has tow functions, first when introduces the first number, when push the bottom, we can
see the square of this number. The second function show it the product of second and third number
*/

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Exercise72(navController: NavController) {
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
            Text(text = "",
                modifier = Modifier.padding(5.dp))
        }

        var inputNumberA by remember { mutableStateOf("") }
        var inputNUmberB by remember { mutableStateOf("") }
        var inputNumberC by remember { mutableStateOf("") }
        var resultA = ""
        var resultBC = ""
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
            value = inputNUmberB,
            onValueChange = { inputNUmberB = it },
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
                resultA = squareNumber(inputNumberA.toDouble()).toString()
                resultBC = productNumber(inputNUmberB.toDouble(), inputNumberC.toDouble()).toString()
                textResult = "The squeare of your number is: $resultA\n" +
                        "The product of second and third number is: $resultBC"
                inputNumberA = ""
                inputNUmberB = ""
                inputNumberC = ""
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
            onClick = {navController.navigate("CoverP14")},
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.End),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black)

        ) {
            Text(text = "Previous",
                color = Color.White)
        }
    }
}

private fun squareNumber(inputNUmber: Double): Double {
    return (inputNUmber * inputNUmber)
}

private fun productNumber(inputNUmberA: Double, inputNUmberB: Double) : Double {
    return inputNUmberA * inputNUmberB
}

