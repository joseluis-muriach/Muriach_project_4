package com.example.muriach_proyecto_5.ui.theme.Project4

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

@Composable
fun MainProject4(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Image(
            painter = painterResource(R.drawable.android),
            contentDescription = "",
            modifier = Modifier
                .size(200.dp)
                .padding(bottom = 30.dp)
        )

        Text(
            text = "Exercises Project 4",
            fontSize = 40.sp
        )
        Spacer(modifier = Modifier.size(30.dp))
        Button(
            onClick = { navController.navigate("Exercise5") },
            modifier = Modifier.width(250.dp)
        ) {
            Text(text = "Exercise 5")
        }

        Button(
            onClick = { navController.navigate("Exercise6") },
            modifier = Modifier.width(250.dp)
        ) {
            Text(text = "Exercise 6")
        }

        Button(
            onClick = {navController.navigate("Exercise7")},
            modifier = Modifier.width(250.dp),
        ) {
            Text(text = "Exercise 7")
        }

        Button(
            onClick = {navController.navigate("Exercise8")},
            modifier = Modifier.width(250.dp)
        ) {
            Text(text = "Exercise 8")
        }

        Button(
            onClick = {navController.navigate("Exercise9")},
            modifier = Modifier.width(250.dp)
        ) {
            Text(text = "Exercise 9")
        }

        Button(
            onClick = {navController.navigate("CoverMain")},
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.Start),
            colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray)

        ) {
            Text(text = "All Projects")
        }

        Button(
            onClick = {navController.navigate("CoverP5")},
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.End),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Red)


        ) {
            Text(text = "Next project")
        }
    }
}