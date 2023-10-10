package com.example.muriach_proyecto_5.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier


import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.muriach_project_6.CoverP6
import com.example.muriach_project_6.Exercise15
import com.example.muriach_project_6.Exercise16
import com.example.muriach_project_6.Exercise17
import com.example.muriach_project_7.CoverP7
import com.example.muriach_project_7.Exercise18
import com.example.muriach_project_7.Exercise19
import com.example.muriach_project_7.Exercise20
import com.example.muriach_project_7.Exercise21
import com.example.muriach_proyect_5.ui.theme.Project5.CoverP5
import com.example.muriach_proyect_5.ui.theme.Project5.Exercise10
import com.example.muriach_proyect_5.ui.theme.Project5.Exercise11
import com.example.muriach_proyect_5.ui.theme.Project5.Exercise12
import com.example.muriach_proyect_5.ui.theme.Project5.Exercise13
import com.example.muriach_proyect_5.ui.theme.Project5.Exercise14
import com.example.muriach_proyecto_5.ui.theme.Project4.Exercise5
import com.example.muriach_proyecto_5.ui.theme.Project4.Exercise6
import com.example.muriach_proyecto_5.ui.theme.Project4.Exercise7
import com.example.muriach_proyecto_5.ui.theme.Project4.Exercise8
import com.example.muriach_proyecto_5.ui.theme.Project4.Exercise9
import com.example.muriach_proyecto_5.ui.theme.Project4.MainProject4
import com.example.muriach_proyecto_5.ui.theme.Project8.CoverP8
import com.example.muriach_proyecto_5.ui.theme.Project8.Exercise23
import com.example.muriach_proyecto_5.ui.theme.Project8.Exercise24
import com.example.muriach_proyecto_5.ui.theme.Project8.Exercise25
import com.example.muriach_proyecto_5.ui.theme.Project8.Exercise26
import com.example.muriach_proyecto_5.ui.theme.Project8.Exercise27
import com.example.muriach_proyecto_5.ui.theme.Project8.Exercise28
import com.example.muriach_proyecto_5.ui.theme.Project8.Exercise29
import com.example.muriach_proyecto_5.ui.theme.Project8.Exercise30
import com.example.muriach_proyecto_5.ui.theme.Project9.CoverP9
import com.example.muriach_proyecto_5.ui.theme.Project9.Exercise31
import com.example.muriach_proyecto_5.ui.theme.Project9.Exercise32

/*
In "Main" in "setContent" we must write our function so we can to run our program
*/
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // A surface container using the 'background' color from the theme
            Surface(
                modifier = Modifier.fillMaxSize()
            )
            {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "CoverP4") {
                    composable("CoverMain") { CoverMain(navController)}

                    //Project 4
                    composable("CoverP4") { MainProject4(navController) }
                    composable("Exercise5") { Exercise5(navController) }
                    composable("Exercise6") { Exercise6(navController) }
                    composable("Exercise7") { Exercise7(navController) }
                    composable("Exercise8") { Exercise8(navController) }
                    composable("Exercise9") { Exercise9(navController) }

                    //Project 5
                    composable("CoverP5") { CoverP5(navController) }
                    composable("Exercise10") { Exercise10(navController) }
                    composable("Exercise11") { Exercise11(navController) }
                    composable("Exercise12") { Exercise12(navController) }
                    composable("Exercise13") { Exercise13(navController) }
                    composable("Exercise14") { Exercise14(navController) }

                    //Project 6
                    composable("CoverP6") { CoverP6(navController) }
                    composable("Exercise15") { Exercise15(navController) }
                    composable("Exercise16") { Exercise16(navController) }
                    composable("Exercise17") { Exercise17(navController) }

                    //Project 7
                    composable("CoverP7") { CoverP7(navController) }
                    composable("Exercise18") { Exercise18(navController) }
                    composable("Exercise19") { Exercise19(navController) }
                    composable("Exercise20") { Exercise20(navController) }
                    composable("Exercise21") { Exercise21(navController) }

                    //Project 8
                    composable("CoverP8") { CoverP8(navController) }
                    composable("Exercise23") { Exercise23(navController) }
                    composable("Exercise24") { Exercise24(navController) }
                    composable("Exercise25") { Exercise25(navController) }
                    composable("Exercise26") { Exercise26(navController) }
                    composable("Exercise27") { Exercise27(navController) }
                    composable("Exercise28") { Exercise28(navController) }
                    composable("Exercise29") { Exercise29(navController) }
                    composable("Exercise30") { Exercise30(navController) }

                    //Project9
                    composable("CoverP9") { CoverP9(navController) }
                    composable("Exercise31") { Exercise31(navController) }
                    composable("Exercise32") { Exercise32(navController) }
                }
            }
        }
    }
}
