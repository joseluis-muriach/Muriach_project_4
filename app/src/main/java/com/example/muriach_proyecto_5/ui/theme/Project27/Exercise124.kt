package com.example.muriach_proyecto_5.ui.theme.Project27




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
This exercise has an array of numbers and the program return the array, the biggest number, and
the smallest number
*/

@Composable
fun Exercise124(navController: NavController) {
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
            Text(
                text = "Only click the button",
                modifier = Modifier.padding(5.dp)
            )
        }

        var textResult by remember { mutableStateOf("") }

        Button(
            onClick = {

                val myObject = ClassP27()

                textResult += "${myObject.showArray()}\n"
                textResult += "The biggest value is: ${myObject.biggestValue()}\n"
                textResult += "The smallest value is: ${myObject.smallestValue()}"

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
            onClick = { navController.navigate("CoverP27") },
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.End),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Yellow)

        ) {
            Text(
                text = "Previous",
                color = Color.Black
            )
        }
    }
}

