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
In this exercise, our program show us if the triangle is equilateral, isosceles or scalene and tell us
how many there are
*/

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Exercise56(navController: NavController) {
    Text(
        text = "Welcome to: \n 'PROBLEM N.10'",
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
                modifier = Modifier.padding(10.dp),
                fontSize = 20.sp
            )
        }

        var sideA by remember { mutableStateOf("") }
        var sideB by remember { mutableStateOf("") }
        var sideC by remember { mutableStateOf("") }
        var quantityEqui by remember { mutableStateOf(0) }
        var quantityIsos by remember { mutableStateOf(0) }
        var quantityScale by remember { mutableStateOf(0) }
        var textResult by remember { mutableStateOf("") }

        OutlinedTextField(
            value = sideA,
            onValueChange = { sideA = it },
            label = {
                Text("Introduce side 1: ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        OutlinedTextField(
            value = sideB,
            onValueChange = { sideB = it },
            label = {
                Text("Introduce side 2: ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        OutlinedTextField(
            value = sideC,
            onValueChange = { sideC = it },
            label = {
                Text("Introduce side 3: ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        Button(
            onClick = {
                      if (sideA.toDouble() == sideB.toDouble() && sideA.toDouble() == sideC.toDouble()){
                          textResult = "equilateral"
                          quantityEqui++
                      } else if (sideA.toDouble() == sideB.toDouble() || sideA.toDouble() == sideC.toDouble()
                          || sideB.toDouble() == sideC.toDouble()) {
                          textResult = "isosceles"
                          quantityIsos++
                      } else {
                          textResult = "scalene"
                          quantityScale++
                      }
                sideA = ""
                sideB = ""
                sideC = ""
            },
            modifier = Modifier.padding(10.dp)
        ) {

            Text(text = "Show table")
        }

        Text(
            text = "The triangle is: $textResult\n" +
                    "Quantity equilateral: $quantityEqui \n" +
                    "Quantity isosceles: $quantityIsos \n" +
                    "Quantity scalene: $quantityScale ",
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

