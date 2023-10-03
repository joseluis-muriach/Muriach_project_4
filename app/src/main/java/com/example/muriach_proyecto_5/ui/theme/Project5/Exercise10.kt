package com.example.muriach_proyect_5.ui.theme.Project5

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
In this exercise we are going to see when you introduce a number if you have to pay taxes or not
*/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Exercise10(navController: NavController) {
    Text(
        text = "Welcome to: 'CALCULATING SALARY'",
        textAlign = TextAlign.Center,
        style = TextStyle(
            fontSize = 20.sp
        ),
        color = Color.Red,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 20.dp),
    )

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {

        var inputSalary by remember { mutableStateOf("")}
        val threeThousand by remember { mutableStateOf(3000.0)}
        var taxes by remember { mutableStateOf("") }

        OutlinedTextField(value = inputSalary,
            onValueChange = {inputSalary = it},
            label = {
                Text("Introduce your salary: ")
                },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
            )

        Button(onClick = {
            if (inputSalary.toDouble() >= threeThousand) {
                taxes = "You must to pay taxes"
            } else {
                taxes = "Don't pay taxes"
            }
        },
            modifier = Modifier.padding(10.dp)) {
            
            Text(text = "Calculate")
        }

        Text(
            text = taxes,
            modifier = Modifier.padding(10.dp),
            style = TextStyle(
                fontSize = 20.sp
            )
        )

        //This button allows to go to "Cover" (also in Exercises 2,3 and 4)
        Button(
            onClick = {navController.navigate("CoverP5")},
            modifier = Modifier.padding(10.dp)
                .align(Alignment.End),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Red)

        ) {
            Text(text = "Previous")
        }
    }
}