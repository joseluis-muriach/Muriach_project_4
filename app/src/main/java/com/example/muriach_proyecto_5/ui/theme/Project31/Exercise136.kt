package com.example.muriach_proyecto_5.ui.theme.Project31

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
The program when the user enter 3 pairs numbers, the program return the maximum number of each pair
numbers
*/

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Exercise136(navController: NavController) {
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
            Text(
                text = "Enter 3 pair numbers",
                modifier = Modifier.padding(5.dp)
            )
        }

        var inputNumberA by remember { mutableStateOf("") }
        var inputNumberB by remember { mutableStateOf("") }
        var result by remember { mutableStateOf("") }
        var totalPairNumbers by remember { mutableStateOf(1) }
        var textResult by remember { mutableStateOf("") }

        OutlinedTextField(
            value = inputNumberA,
            onValueChange = { inputNumberA = it },
            label = {
                Text("Enter the first number:")
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
                Text("Enter the second number:")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        Button(
            onClick = {
                if (totalPairNumbers == 3) {
                    result +=
                        (Greater.maximum(
                            inputNumberA.toDouble(), inputNumberB.toDouble()).toString()
                                ) + "\n"
                    textResult = result
                } else {
                    result +=
                        (Greater.maximum(
                            inputNumberA.toDouble(), inputNumberB.toDouble()).toString()
                                ) + "\n"
                }
                totalPairNumbers++
                inputNumberA = ""
                inputNumberB = ""
            },
            modifier = Modifier.padding(10.dp)
        ) {

            Text(
                text = "Load the result",
            )
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
            onClick = { navController.navigate("CoverP31") },
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.End),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)

        ) {
            Text(
                text = "Previous",
                color = Color.White
            )
        }
    }
}

