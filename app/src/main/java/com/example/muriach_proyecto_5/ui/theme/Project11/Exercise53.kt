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
In this exercise, when we enter a number the program shows you the first numbers up to your number.
*/

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Exercise53(navController: NavController) {
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
            Text(
                text = "",
                modifier = Modifier.padding(5.dp)
            )
        }

        var number by remember { mutableStateOf("") }
        var sumNumber by remember { mutableStateOf(0.0) }
        var quantity by remember { mutableStateOf(0) }
        var textResult by remember { mutableStateOf("") }

        OutlinedTextField(
            value = number,
            onValueChange = { number = it },
            label = {
                Text("Introduce the numbers: ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        Button(
            onClick = {
                quantity++
                if (quantity >= 5) {
                    if (quantity == 10) {
                        sumNumber += number.toDouble()
                        textResult = "The result of your sum is: " + sumNumber.toString()
                    } else {
                        sumNumber += number.toDouble()
                    }
                }
                number = ""
            },
            modifier = Modifier.padding(10.dp)
        ) {

            Text(text = "Calculate")
        }

        Text(
            text = "$textResult",
            modifier = Modifier.padding(10.dp),
            style = TextStyle(
                fontSize = 20.sp
            )
        )

        //This button allows to go to "Cover" (also in Exercises 2,3 and 4)
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

