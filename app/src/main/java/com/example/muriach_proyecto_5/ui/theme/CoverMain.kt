package com.example.muriach_proyecto_5.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun CoverMain(navController: NavController){
    Column(Modifier.fillMaxSize()) {
        Row(Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center) {
            Button(
                onClick = {navController.navigate("CoverP4")},
                modifier = Modifier.padding(3.dp),

            ) {
                Text(text = "P4")
            }

            Button(
                onClick = {navController.navigate("CoverP5")},
                modifier = Modifier.padding(3.dp)
            ) {
                Text(text = "P5")
            }

            Button(
                onClick = {navController.navigate("CoverP6")},
                modifier = Modifier.padding(3.dp)
            ) {
                Text(text = "P6")
            }

            Button(
                onClick = {navController.navigate("CoverP7")},
                modifier = Modifier.padding(3.dp)
            ) {
                Text(text = "P7")
            }

            Button(
                onClick = {navController.navigate("CoverP8")},
                modifier = Modifier.padding(3.dp)
            ) {
                Text(text = "P8")
            }
        }

        Row(Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center) {
            Button(
                onClick = {navController.navigate("CoverP9")},
                modifier = Modifier.padding(3.dp),

            ) {
                Text(text = "P9")
            }

            Button(
                onClick = {navController.navigate("CoverP10")},
                modifier = Modifier.padding(3.dp)
            ) {
                Text(text = "P10")
            }

            Button(
                onClick = {navController.navigate("CoverP11")},
                modifier = Modifier.padding(3.dp)
            ) {
                Text(text = "P11")
            }

            Button(
                onClick = {navController.navigate("CoverP12")},
                modifier = Modifier.padding(3.dp)
            ) {
                Text(text = "P12")
            }

            Button(
                onClick = {navController.navigate("CoverP13")},
                modifier = Modifier.padding(3.dp)
            ) {
                Text(text = "P13")
            }
        }
    }
}