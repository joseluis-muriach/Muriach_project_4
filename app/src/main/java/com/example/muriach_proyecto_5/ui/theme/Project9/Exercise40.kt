package com.example.muriach_proyecto_5.ui.theme.Project9

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
This program compare the lists what is the biggest
*/

@Composable
fun Exercise40(navController: NavController) {
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
            Text(text = "There are two lists in the code, this program compare those and tell you " +
                    "what is the biggest",
                modifier = Modifier.padding(5.dp))
        }

        //Tables where you can introduce numbers
        val tableA = listOf(1, 2, 3, 14, 5, 6, 7, 8, 9, 10)
        val tableB = listOf(1, 2, 3, 4, 59, 6, 7, 8, 9, 10)

        var maximumNumberListA by remember { mutableStateOf(0) }
        var maximumNumberListB by remember { mutableStateOf(0) }
        var textResult by remember { mutableStateOf("") }

        Row(Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center) {

            Button(
                onClick = {
                    for (number in tableA){
                        if (number > maximumNumberListA) {
                            maximumNumberListA = number
                        }
                    }

                    for (number in tableB) {
                        if (number > maximumNumberListA) {
                            maximumNumberListB = number
                        }
                    }

                    if (maximumNumberListA > maximumNumberListB) {
                        textResult = "The list A is bigger than B"
                    } else if (maximumNumberListA < maximumNumberListB) {
                        textResult = "The list B is bigger than A"
                    } else {
                        textResult = "The list are equals"
                    }
                },

                modifier = Modifier.padding(10.dp)
            ) {

                Text(text = "Enter")
            }
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
            Text(
                text = "Previous",
                color = Color.White
            )
        }
    }
}

