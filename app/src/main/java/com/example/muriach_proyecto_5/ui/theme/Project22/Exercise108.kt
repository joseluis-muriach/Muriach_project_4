package com.example.muriach_proyecto_5.ui.theme.Project22

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
This program return the sum of numbers of an array
*/

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Exercise108(navController: NavController) {
    Text(
        text = "Welcome to: \n 'PROBLEM N.4'",
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
            Text(text = "Enter the quantity of the numbers that you want introduce and after " +
                    "introduce the numbers of one a time",
                modifier = Modifier.padding(5.dp))
        }

        var inputArrayNum by remember { mutableStateOf("") }
        var numbers by remember { mutableStateOf(emptyList<Int>()) }
        var textResult by remember { mutableStateOf("") }

        OutlinedTextField(
            value = inputArrayNum,
            onValueChange = { inputArrayNum = it },
            label = {
                Text("Enter the quantity of numbers:")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        Button(
            onClick = {
                val input = inputArrayNum
                val inputNumbers = input.split(",").mapNotNull { it.toIntOrNull() }
                numbers = inputNumbers
                inputArrayNum = ""
            },
            modifier = Modifier.padding(10.dp)
        ) {

            Text(text = "Load array")
        }

        if (numbers.isNotEmpty()) {
            FindMinAndCheckRepetition(arrayNumbers = numbers)
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
            onClick = {navController.navigate("CoverP22")},
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.End),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)

        ) {
            Text(text = "Previous",
                color = Color.White
            )
        }
    }
}

@Composable
fun FindMinAndCheckRepetition(arrayNumbers: List<Int>) {
    var minNum by remember { mutableStateOf(Int.MAX_VALUE) }
    var isRepeated by remember { mutableStateOf(false) }

    for (num in arrayNumbers) {
        if (num < minNum) {
            minNum = num
            isRepeated = false
        } else if (num == minNum) {
            isRepeated = true
        }
    }
    Column {
        Text(text = "--> The smallest number is: $minNum")
        if (isRepeated) {
            Text(text = "--> The smallest number is repeat into the array")
        }
    }
}
