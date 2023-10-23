package com.example.muriach_proyecto_5.ui.theme.Project10

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
In this program I do not do a do while because when you execute the program it repeats
without the need for a do while
 */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Exercise46(navController: NavController) {
    Text(
        text = "Welcome to: \n 'PROBLEM N.5'",
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

    var countUser by remember { mutableStateOf("") }
    var salary by remember { mutableStateOf("") }
    var textResult by remember { mutableStateOf("") }

    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {

        Text(text = "In this exercise when click in bottom the program save the numbers until introduce" +
                "the number 9999",
            Modifier.padding(5.dp),
            fontSize = 20.sp)

        OutlinedTextField(
            value = countUser,
            onValueChange = { countUser = it },
            label = {
                Text("Introduce the count number: ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        OutlinedTextField(
            value = salary,
            onValueChange = { salary = it },
            label = {
                Text("Introduce the salary: ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        Button(
            onClick = {
                if (salary.toDouble() < 0) {
                    textResult = "The count $countUser is debit balance"
                } else if (salary.toDouble() > 0) {
                    textResult = "The count $countUser is credit balance"
                } else {
                    textResult = "The count $countUser is zero balance"
                }
                countUser = ""
                salary = ""
            },
            modifier = Modifier.padding(10.dp)
        ) {

            Text(text = "Enter")
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
            onClick = {navController.navigate("CoverP10")},
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.End),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black)

        ) {
            Text(text = "Previous",
                color = Color.White
            )
        }
    }
}