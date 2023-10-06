package com.example.muriach_proyecto_5.ui.theme.Project8

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
In this exercise, when we enter three numbers, the program will tell you if they are less than 10
*/

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Exercise29(navController: NavController) {
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
            Text(text = "In this exercise, when you introduce the coordinate x and y," +
                    "the program will tell you in what quadrant is it",
                modifier = Modifier.padding(5.dp))
        }

        var coordenateX by remember { mutableStateOf("") }
        var coordenateY by remember { mutableStateOf("") }
        var textResult by remember { mutableStateOf("") }

        OutlinedTextField(
            value = coordenateX,
            onValueChange = { coordenateX = it },
            label = {
                Text("Introduce the first number: ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        OutlinedTextField(
            value = coordenateY,
            onValueChange = { coordenateY = it },
            label = {
                Text("Introduce the second number: ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        Button(
            onClick = {
                if (coordenateX.toInt() > 0 && coordenateY.toInt() > 0) {
                    textResult = "First quadrant"
                } else if(coordenateX.toInt() < 0 && coordenateY.toInt() > 0) {
                    textResult = "Second quadrant"
                } else if(coordenateX.toInt() > 0 && coordenateY.toInt() < 0) {
                    textResult = "Third quadrant"
                } else {
                    textResult = "Fourth quadrant"
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

        //This button allows to go to "Cover" (also in Exercises 2,3 and 4)
        Button(
            onClick = {navController.navigate("CoverP8")},
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.End),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)

        ) {
            Text(text = "Previous")
        }
    }
}

