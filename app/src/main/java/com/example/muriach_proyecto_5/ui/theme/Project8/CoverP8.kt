package com.example.muriach_proyecto_5.ui.theme.Project8

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
In this screen i can see the COVER where we will see the exercises
*/

@Composable
fun CoverP8(navController: NavController) {
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
                .size(250.dp)
                .padding(bottom = 30.dp)
        )

        Text(
            text = "Exercises Project 8",
            fontSize = 40.sp
        )
        Spacer(modifier = Modifier.size(30.dp))

        Row(Modifier.fillMaxWidth()
            .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(3.dp),
                //Horizontal alignment to center
                horizontalAlignment = Alignment.CenterHorizontally,
                //Vertical space between elements
                verticalArrangement = Arrangement.spacedBy(1.dp)
            ) {
                Button(
                    onClick = { navController.navigate("Exercise23") },
                    modifier = Modifier.width(250.dp)
                        .padding(3.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
                ) {
                    Text(
                        text = "Exercise 23"
                    )
                }

                Button(
                    onClick = { navController.navigate("Exercise24") },
                    modifier = Modifier.width(250.dp)
                        .padding(3.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)

                ) {
                    Text(
                        text = "Exercise 24"
                    )
                }

                Button(
                    onClick = { navController.navigate("Exercise25") },
                    modifier = Modifier.width(250.dp)
                        .padding(3.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
                ) {
                    Text(text = "Exercise 25")
                }

                Button(
                    onClick = { navController.navigate("Exercise26") },
                    modifier = Modifier.width(250.dp)
                        .padding(3.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
                ) {
                    Text(text = "Exercise 26")
                }
            }

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(3.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(1.dp)
            ){
                Button(
                    onClick = { navController.navigate("Exercise27") },
                    modifier = Modifier.width(250.dp)
                        .padding(3.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
                ) {
                    Text(
                        text = "Exercise 27"
                    )
                }

                Button(
                    onClick = { navController.navigate("Exercise28") },
                    modifier = Modifier.width(250.dp)
                        .padding(3.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)

                ) {
                    Text(
                        text = "Exercise 28"
                    )
                }

                Button(
                    onClick = { navController.navigate("Exercise29") },
                    modifier = Modifier.width(250.dp)
                        .padding(3.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
                ) {
                    Text(text = "Exercise 29")
                }

                Button(
                    onClick = { navController.navigate("Exercise30") },
                    modifier = Modifier.width(250.dp)
                        .padding(3.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
                ) {
                    Text(text = "Exercise 30")
                }
            }
        }

        Button(
            onClick = { navController.navigate("CoverMain") },
            modifier = Modifier.align(Alignment.Start)
                .padding(3.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray)
        ) {
            Text(text = "All projects")
        }

        Button(
            onClick = { navController.navigate("CoverP7") },
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.End),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)

        ) {
            Text(text = "Next project")
        }
    }
}