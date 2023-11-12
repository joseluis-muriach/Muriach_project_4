package com.example.muriach_proyecto_5.ui.theme.Project18

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
In this program you can introduce 2 to 5 numbers and the program return the sum
*/

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Exercise93(navController: NavController) {
    Text(
        text = "Welcome to: \n 'PROBLEM N.7'",
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

        var inputNumA by remember { mutableStateOf("") }
        var inputNumB by remember { mutableStateOf("") }
        var inputNumC by remember { mutableStateOf("") }
        var inputNumD by remember { mutableStateOf("") }
        var textResult by remember { mutableStateOf("") }

        OutlinedTextField(
            value = inputNumA,
            onValueChange = { inputNumA = it },
            label = {
                Text("Introduce a number: ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        OutlinedTextField(
            value = inputNumB,
            onValueChange = { inputNumB = it },
            label = {
                Text("Introduce a number: ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        OutlinedTextField(
            value = inputNumC,
            onValueChange = { inputNumC = it },
            label = {
                Text("Introduce a number: ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        OutlinedTextField(
            value = inputNumD,
            onValueChange = { inputNumD = it },
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
                      if (inputNumC.isEmpty()) {
                          inputNumC = 0.toString()
                          inputNumD = 0.toString()
                          textResult = "The sum of $inputNumA + $inputNumB is: " +
                                  "${sum(inputNumA.toDouble(), inputNumB.toDouble(),
                              inputNumC.toDouble(),inputNumD.toDouble())}"
                      } else if (inputNumD.isEmpty()){
                          inputNumD = 0.toString()
                          textResult = "The sum of $inputNumA + $inputNumB + $inputNumC is: " +
                                  "${sum(inputNumA.toDouble(), inputNumB.toDouble(),
                                      inputNumC.toDouble(),inputNumD.toDouble())}"
                      } else {
                          textResult = "The sum of $inputNumA + $inputNumB + $inputNumC + $inputNumD is: " +
                                  "${sum(inputNumA.toDouble(), inputNumB.toDouble(),
                                      inputNumC.toDouble(),inputNumD.toDouble())}"
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
            onClick = {navController.navigate("CoverP18")},
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.End),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)

        ) {
            Text(text = "Previous",
                color = Color.White)
        }
    }
}

fun sum(numA: Double, numB: Double, numC: Double, numD: Double): Double{
    return numA + numB + numC + numD
}