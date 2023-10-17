package com.example.muriach_proyecto_5.ui.theme.Project9

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

*/

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Exercise37(navController: NavController) {
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

        var salary by remember{(mutableStateOf(""))}
        var smallerThanThree by remember{(mutableStateOf(""))}
        var biggerThanThree by remember {(mutableStateOf(""))}
        var totalSalary by remember {(mutableStateOf(""))}
        var textResult by remember { mutableStateOf("") }

        OutlinedTextField(
            value = salary,
            onValueChange = { salary = it },
            label = {
                Text("Enter salary  ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        Button(
            onClick = {
                      if (salary.toDouble() >= 100 && salary.toDouble() <= 300 ) {
                          smallerThanThree = (smallerThanThree.toInt() + 1).toString()
                      } else if(salary.toDouble() > 300){
                          biggerThanThree = (biggerThanThree.toInt() + 1).toString()
                      }
                totalSalary = (totalSalary.toDouble() + salary.toDouble()).toString()
            },
            modifier = Modifier.padding(10.dp)
        ) {

            Text(text = "Enter")
        }

        Text(
            text = "Between 100$ and 300$: $textResult\n" +
                    "Bigger than 300$: $biggerThanThree\n" +
                    "The total salary of the enterprise: $totalSalary",
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

