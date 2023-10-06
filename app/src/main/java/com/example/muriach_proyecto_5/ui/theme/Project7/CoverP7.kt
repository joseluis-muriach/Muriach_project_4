package com.example.muriach_project_7

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.muriach_proyecto_5.R

/*
In this screen i can see the COVER where we will see the exercises
*/

@Composable
fun CoverP7(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Image(
            painter = painterResource(R.drawable.android),
            contentDescription = "",
            modifier = Modifier.size(200.dp)
                .padding(bottom = 30.dp)
        )

        Text(
            text = "Exercises Project 7",
            fontSize = 40.sp
        )
        Spacer(modifier = Modifier.size(30.dp))
        Button(
            onClick = { navController.navigate("Exercise18") },
            modifier = Modifier.width(250.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Yellow)
        ) {
            Text(text = "Exercise 18",
                color = Color.Black
            )
        }

        Button(
            onClick = { navController.navigate("Exercise19") },
            modifier = Modifier.width(250.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Yellow)

        ) {
            Text(text = "Exercise 19",
                color = Color.Black
            )
        }

        Button(
            onClick = {navController.navigate("Exercise20")},
            modifier = Modifier.width(250.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Yellow)
        ) {
            Text(text = "Exercise 20",
                color = Color.Black
            )
        }

        Button(
            onClick = {navController.navigate("Exercise21")},
            modifier = Modifier.width(250.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Yellow)
        ) {
            Text(text = "Exercise 21",
                color = Color.Black
            )
        }

        Button(
            onClick = {navController.navigate("CoverMain")},
            modifier = Modifier.align(Alignment.Start),
            colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray)


        ) {
            Text(text = "All projects")
        }
        Button(
            onClick = {navController.navigate("CoverP8")},
            modifier = Modifier.padding(10.dp)
                .align(Alignment.End),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)

        ) {
            Text(text = "Next project")
        }
    }
}