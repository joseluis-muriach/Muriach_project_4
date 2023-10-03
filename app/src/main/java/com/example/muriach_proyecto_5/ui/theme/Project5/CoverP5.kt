package com.example.muriach_proyect_5.ui.theme.Project5

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
In 'Cover' has the menu for choose the exercises, Exercise 1 to Exercise 4.1
*/

@Composable
fun CoverP5(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        Arrangement.Center
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            Arrangement.Center
        ) {
            Image(
                painter = painterResource(R.drawable.android),
                contentDescription = "",
                modifier = Modifier.size(200.dp)
                    .padding(bottom = 30.dp)
                    .fillMaxWidth(),
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            Arrangement.Center
        ) {

            Text(
                text = "Exercises Project 5",
                fontSize = 40.sp,
                modifier = Modifier.padding(20.dp)
            )

            Spacer(modifier = Modifier.size(30.dp))
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            Arrangement.Center
        ) {
            Button(
                onClick = { navController.navigate("Exercise10") },
                modifier = Modifier
                    .width(200.dp)
                    .padding(4.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red)

            ) {
                Text(text = "Exercise 10")
            }

            Button(
                onClick = { navController.navigate("Exercise11") },
                modifier = Modifier
                    .width(200.dp)
                    .padding(4.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red)

            ) {
                Text(text = "Exercise 11")
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            Arrangement.Center
        ) {
            Button(
                onClick = { navController.navigate("Exercise12") },
                modifier = Modifier
                    .width(200.dp)
                    .padding(4.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red)

            ) {
                Text(text = "Exercise 12")
            }

            Button(
                onClick = { navController.navigate("Exercise13") },
                modifier = Modifier
                    .width(200.dp)
                    .padding(4.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red)

            ) {
                Text(text = "Exercise 13")
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            Arrangement.Center
        ) {
            Button(
                onClick = { navController.navigate("Exercise14") },
                modifier = Modifier
                    .width(200.dp)
                    .padding(4.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red)

            ) {
                Text(text = "Exercise 14")
            }
        }

        Button(
            onClick = {navController.navigate("CoverMain")},
            modifier = Modifier.padding(10.dp)
                .align(Alignment.Start),
            colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray)


        ) {
            Text(text = "All projects")
        }

        Button(
            onClick = {navController.navigate("CoverP6")},
            modifier = Modifier.padding(10.dp)
                .align(Alignment.End),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Green)


        ) {
            Text(text = "   Next project",
                color = Color.Black
            )
        }
    }
}