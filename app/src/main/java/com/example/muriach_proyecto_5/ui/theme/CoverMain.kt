package com.example.muriach_proyecto_5.ui.theme

import android.annotation.SuppressLint
import android.support.v4.os.IResultReceiver.Default
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "InvalidColorHexValue")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CoverMain(navController: NavController){
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
        ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(top = 10.dp, bottom = 10.dp)
                .background(Color(0xFFBEA8FC)),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
        ) {
            Text(
                text = "ALL PROJECTS",
                fontSize = 40.sp,
                color = Color.White

            )
        }

        Row(Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center) {
            Button(
                onClick = {navController.navigate("CoverP4")},
                modifier = Modifier
                    .padding(3.dp)
                    .weight(1f),

            ) {
                Text(text = "P4")
            }

            Button(
                onClick = {navController.navigate("CoverP5")},
                modifier = Modifier
                    .padding(3.dp)
                    .weight(1f)
            ) {
                Text(text = "P5")
            }

            Button(
                onClick = {navController.navigate("CoverP6")},
                modifier = Modifier
                    .padding(3.dp)
                    .weight(1f)
            ) {
                Text(text = "P6")
            }

            Button(
                onClick = {navController.navigate("CoverP7")},
                modifier = Modifier
                    .padding(3.dp)
                    .weight(1f)
            ) {
                Text(text = "P7")
            }

            Button(
                onClick = {navController.navigate("CoverP8")},
                modifier = Modifier
                    .padding(3.dp)
                    .weight(1f)
            ) {
                Text(text = "P8")
            }
        }

        Row(Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center) {
            Button(
                onClick = {navController.navigate("CoverP9")},
                modifier = Modifier.padding(3.dp)

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

        Row(Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center) {
            Button(
                onClick = {navController.navigate("CoverP14")},
                modifier = Modifier.padding(2.dp),

            ) {
                Text(text = "P14")
            }

            Button(
                onClick = {navController.navigate("CoverP15")},
                modifier = Modifier.padding(2.dp)
            ) {
                Text(text = "P15")
            }

            Button(
                onClick = {navController.navigate("CoverP16")},
                modifier = Modifier.padding(2.dp)
            ) {
                Text(text = "P16")
            }

            Button(
                onClick = {navController.navigate("CoverP17")},
                modifier = Modifier.padding(2.dp)
            ) {
                Text(text = "P17")
            }

            Button(
                onClick = {navController.navigate("CoverP18")},
                modifier = Modifier.padding(2.dp)
            ) {
                Text(text = "P18")
            }
        }

        Row(Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center) {
            Button(
                onClick = {navController.navigate("CoverP19")},
                modifier = Modifier.padding(2.dp),

            ) {
                Text(text = "P19")
            }

            Button(
                onClick = {navController.navigate("CoverP20")},
                modifier = Modifier.padding(2.dp)
            ) {
                Text(text = "P20")
            }


            Button(
                onClick = {navController.navigate("CoverP21")},
                modifier = Modifier.padding(2.dp)
            ) {
                Text(text = "P21")
            }

            Button(
                onClick = {navController.navigate("CoverP22")},
                modifier = Modifier.padding(2.dp)
            ) {
                Text(text = "P22")
            }

            Button(
                onClick = {navController.navigate("CoverP23")},
                modifier = Modifier.padding(2.dp),

                ) {
                Text(text = "P23")
            }
        }

        Row(Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center) {
            Button(
                onClick = {navController.navigate("CoverP24")},
                modifier = Modifier.padding(2.dp)
            ) {
                Text(text = "P24")
            }

            Button(
                onClick = {navController.navigate("CoverP25")},
                modifier = Modifier.padding(2.dp)
            ) {
                Text(text = "P25")
            }

            Button(
                onClick = {navController.navigate("CoverP26")},
                modifier = Modifier.padding(2.dp)
            ) {
                Text(text = "P26")
            }

            Button(
                onClick = {navController.navigate("CoverP27")},
                modifier = Modifier.padding(2.dp)
            ) {
                Text(text = "P27")
            }
            Button(
                onClick = {navController.navigate("CoverP28")},
                modifier = Modifier.padding(2.dp)
            ) {
                Text(text = "P28")
            }
        }

        Row(Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center) {
            Button(
                onClick = {navController.navigate("CoverP29")},
                modifier = Modifier.padding(2.dp)
            ) {
                Text(text = "P29")
            }

            Button(
                onClick = {navController.navigate("CoverP30")},
                modifier = Modifier.padding(2.dp)
            ) {
                Text(text = "P30")
            }

            Button(
                onClick = {navController.navigate("CoverP31")},
                modifier = Modifier.padding(2.dp)
            ) {
                Text(text = "P31")
            }

            Button(
                onClick = {navController.navigate("CoverP32")},
                modifier = Modifier.padding(2.dp)
            ) {
                Text(text = "P32")
            }
            Button(
                onClick = {navController.navigate("CoverP33")},
                modifier = Modifier.padding(2.dp)
            ) {
                Text(text = "P33")
            }
        }

        Row(Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center) {
            Button(
                onClick = {navController.navigate("CoverP34")},
                modifier = Modifier.padding(2.dp)
            ) {
                Text(text = "P34")
            }

            Button(
                onClick = {navController.navigate("CoverP35")},
                modifier = Modifier.padding(2.dp)
            ) {
                Text(text = "P35")
            }

            Button(
                onClick = {navController.navigate("CoverP36")},
                modifier = Modifier.padding(2.dp)
            ) {
                Text(text = "P36")
            }

            Button(
                onClick = {navController.navigate("CoverP37")},
                modifier = Modifier.padding(2.dp)
            ) {
                Text(text = "P37")
            }
            Button(
                onClick = {navController.navigate("CoverP38")},
                modifier = Modifier.padding(2.dp)
            ) {
                Text(text = "P38")
            }
        }
    }
}