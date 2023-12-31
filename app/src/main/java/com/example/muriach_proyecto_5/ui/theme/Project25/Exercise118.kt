package com.example.muriach_proyecto_5.ui.theme.Project25

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
When you introduce 5 ages this program show the ages and show the greatest and smallest age
*/

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Exercise118(navController: NavController) {
    Text(
        text = "Welcome to: \n 'PROBLEM N.2'",
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
            Text(text = "Introduce 5 ages --> F.e.: 21,3,4,56,12",
                modifier = Modifier.padding(5.dp))
        }
        var inputAge by remember { mutableStateOf("") }
        var numbers by remember { mutableStateOf(emptyList<Int>()) }
        var result by remember { mutableStateOf("") }
        var textResult by remember { mutableStateOf("") }

        OutlinedTextField(
            value = inputAge,
            onValueChange = { inputAge = it },
            label = {
                Text("Enter the ages:")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        Button(
            onClick = {
                val input = inputAge
                var age = input.split(",").mapNotNull { it.toIntOrNull() }
                numbers = age

                result = "Ages: " + arrayAges(numbers).toString() + "\n"
                result += "Greatest age: " + greatestAge(numbers) + "\n"
                result += "Smallest age: " + smallestAge(numbers)

                textResult = result
            },
            modifier = Modifier.padding(10.dp)
        ) {

            Text(text = "Load")
        }

        Text(
            text =textResult,
            modifier = Modifier.padding(10.dp),
            style = TextStyle(
                fontSize = 20.sp
            )
        )

        //This button allows to go to "Cover" (also in all Exercises)
        Button(
            onClick = {navController.navigate("CoverP25")},
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.End),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Green)

        ) {
            Text(text = "Previous",
                color = Color.Black
            )
        }
    }
}

