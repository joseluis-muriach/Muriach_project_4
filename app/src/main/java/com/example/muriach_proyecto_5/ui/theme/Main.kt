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
import com.example.muriach_proyecto_5.ui.theme.Project10.CoverP10
import com.example.muriach_proyecto_5.ui.theme.Project10.Exercise45
import com.example.muriach_proyecto_5.ui.theme.Project10.Exercise46
import com.example.muriach_proyecto_5.ui.theme.Project11.Exercise52
import com.example.muriach_proyecto_5.ui.theme.Project11.Exercise53
import com.example.muriach_proyecto_5.ui.theme.Project11.Exercise54
import com.example.muriach_proyecto_5.ui.theme.Project11.Exercise55
import com.example.muriach_proyecto_5.ui.theme.Project11.Exercise56
import com.example.muriach_proyecto_5.ui.theme.Project11.Exercise57
import com.example.muriach_proyecto_5.ui.theme.Project11.Exercise58
import com.example.muriach_proyecto_5.ui.theme.Project11.Exercise64
import com.example.muriach_proyecto_5.ui.theme.Project12.CoverP12
import com.example.muriach_proyecto_5.ui.theme.Project12.Exercise62
import com.example.muriach_proyecto_5.ui.theme.Project12.Exercise63
import com.example.muriach_proyecto_5.ui.theme.Project13.CoverP13
import com.example.muriach_proyecto_5.ui.theme.Project13.Exercise69
import com.example.muriach_proyecto_5.ui.theme.Project14.CoverP14
import com.example.muriach_proyecto_5.ui.theme.Project14.Exercise72
import com.example.muriach_proyecto_5.ui.theme.Project14.Exercise73
import com.example.muriach_proyecto_5.ui.theme.Project15.CoverP15
import com.example.muriach_proyecto_5.ui.theme.Project15.Exercise77
import com.example.muriach_proyecto_5.ui.theme.Project15.Exercise78
import com.example.muriach_proyecto_5.ui.theme.Project16.CoverP16
import com.example.muriach_proyecto_5.ui.theme.Project16.Exercise82
import com.example.muriach_proyecto_5.ui.theme.Project16.Exercise83
import com.example.muriach_proyecto_5.ui.theme.Project16.Exercise84
import com.example.muriach_proyecto_5.ui.theme.Project17.CoverP17
import com.example.muriach_proyecto_5.ui.theme.Project17.Exercise88
import com.example.muriach_proyecto_5.ui.theme.Project17.Exercise89
import com.example.muriach_proyecto_5.ui.theme.Project17.Exercise90
import com.example.muriach_proyecto_5.ui.theme.Project17.Exercise91
import com.example.muriach_proyecto_5.ui.theme.Project18.CoverP18
import com.example.muriach_proyecto_5.ui.theme.Project18.Exercise93
import com.example.muriach_proyecto_5.ui.theme.Project19.CoverP19
import com.example.muriach_proyecto_5.ui.theme.Project19.Exercise95
import com.example.muriach_proyecto_5.ui.theme.Project20.CoverP20
import com.example.muriach_proyecto_5.ui.theme.Project20.Exercise97
import com.example.muriach_proyecto_5.ui.theme.Project21.CoverP21
import com.example.muriach_proyecto_5.ui.theme.Project21.Exercise103
import com.example.muriach_proyecto_5.ui.theme.Project21.Exercise104
import com.example.muriach_proyecto_5.ui.theme.Project22.CoverP22
import com.example.muriach_proyecto_5.ui.theme.Project22.Exercise107
import com.example.muriach_proyecto_5.ui.theme.Project22.Exercise108
import com.example.muriach_proyecto_5.ui.theme.Project23.CoverP23
import com.example.muriach_proyecto_5.ui.theme.Project23.Exercise111
import com.example.muriach_proyecto_5.ui.theme.Project24.CoverP24
import com.example.muriach_proyecto_5.ui.theme.Project24.Exercise115
import com.example.muriach_proyecto_5.ui.theme.Project24.Exercise116
import com.example.muriach_proyecto_5.ui.theme.Project25.CoverP25
import com.example.muriach_proyecto_5.ui.theme.Project25.Exercise118
import com.example.muriach_proyecto_5.ui.theme.Project26.CoverP26
import com.example.muriach_proyecto_5.ui.theme.Project26.Exercise121
import com.example.muriach_proyecto_5.ui.theme.Project27.CoverP27
import com.example.muriach_proyecto_5.ui.theme.Project27.Exercise124
import com.example.muriach_proyecto_5.ui.theme.Project28.CoverP28
import com.example.muriach_proyecto_5.ui.theme.Project28.Exercise125
import com.example.muriach_proyecto_5.ui.theme.Project28.Exercise126
import com.example.muriach_proyecto_5.ui.theme.Project29.CoverP29
import com.example.muriach_proyecto_5.ui.theme.Project29.Exercise130
import com.example.muriach_proyecto_5.ui.theme.Project30.CoverP30
import com.example.muriach_proyecto_5.ui.theme.Project30.Exercise133
import com.example.muriach_proyecto_5.ui.theme.Project31.CoverP31
import com.example.muriach_proyecto_5.ui.theme.Project31.Exercise136
import com.example.muriach_proyecto_5.ui.theme.Project32.CoverP32
import com.example.muriach_proyecto_5.ui.theme.Project32.CoverP33
import com.example.muriach_proyecto_5.ui.theme.Project32.CoverP34
import com.example.muriach_proyecto_5.ui.theme.Project32.Exercise139
import com.example.muriach_proyecto_5.ui.theme.Project33.Exercise141
import com.example.muriach_proyecto_5.ui.theme.Project34.Exercise142
import com.example.muriach_proyecto_5.ui.theme.Project35.CoverP35
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
import com.example.muriach_proyecto_5.ui.theme.Project9.CoverP11
import com.example.muriach_proyecto_5.ui.theme.Project9.CoverP9
import com.example.muriach_proyecto_5.ui.theme.Project9.Exercise31
import com.example.muriach_proyecto_5.ui.theme.Project9.Exercise32
import com.example.muriach_proyecto_5.ui.theme.Project9.Exercise33
import com.example.muriach_proyecto_5.ui.theme.Project9.Exercise34
import com.example.muriach_proyecto_5.ui.theme.Project9.Exercise35
import com.example.muriach_proyecto_5.ui.theme.Project9.Exercise36
import com.example.muriach_proyecto_5.ui.theme.Project9.Exercise37
import com.example.muriach_proyecto_5.ui.theme.Project9.Exercise38
import com.example.muriach_proyecto_5.ui.theme.Project9.Exercise39
import com.example.muriach_proyecto_5.ui.theme.Project9.Exercise40
import com.example.muriach_proyecto_5.ui.theme.Project9.Exercise41

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
                    composable("Exercise33") { Exercise33(navController) }
                    composable("Exercise34") { Exercise34(navController) }
                    composable("Exercise35") { Exercise35(navController) }
                    composable("Exercise36") { Exercise36(navController) }
                    composable("Exercise37") { Exercise37(navController) }
                    composable("Exercise38") { Exercise38(navController) }
                    composable("Exercise39") { Exercise39(navController) }
                    composable("Exercise40") { Exercise40(navController) }
                    composable("Exercise41") { Exercise41(navController) }

                    //Project10
                    composable("CoverP10") { CoverP10(navController) }
                    composable("Exercise45") { Exercise45(navController) }
                    composable("Exercise46") { Exercise46(navController) }

                    //Project11
                    composable("CoverP11") { CoverP11(navController) }
                    composable("Exercise52") { Exercise52(navController) }
                    composable("Exercise53") { Exercise53(navController) }
                    composable("Exercise54") { Exercise54(navController) }
                    composable("Exercise55") { Exercise55(navController) }
                    composable("Exercise56") { Exercise56(navController) }
                    composable("Exercise57") { Exercise57(navController) }
                    composable("Exercise58") { Exercise58(navController) }

                    //Project12
                    composable("CoverP12") { CoverP12(navController) }
                    composable("Exercise62") { Exercise62(navController) }
                    composable("Exercise63") { Exercise63(navController) }
                    composable("Exercise64") { Exercise64(navController) }

                    //Project13
                    composable("CoverP13") { CoverP13(navController) }
                    composable("Exercise69") { Exercise69(navController) }

                    //Project14
                    composable("CoverP14") { CoverP14(navController) }
                    composable("Exercise72") { Exercise72(navController) }
                    composable("Exercise73") { Exercise73(navController) }

                    //Project15
                    composable("CoverP15") { CoverP15(navController) }
                    composable("Exercise77") { Exercise77(navController) }
                    composable("Exercise78") { Exercise78(navController) }

                    //Project16
                    composable("CoverP16") { CoverP16(navController) }
                    composable("Exercise82") { Exercise82(navController) }
                    composable("Exercise83") { Exercise83(navController) }
                    composable("Exercise84") { Exercise84(navController) }


                    //Project17
                    composable("CoverP17") { CoverP17(navController) }
                    composable("Exercise88") { Exercise88(navController) }
                    composable("Exercise89") { Exercise89(navController) }
                    composable("Exercise90") { Exercise90(navController) }
                    composable("Exercise91") { Exercise91(navController) }

                    //Project18
                    composable("CoverP18") { CoverP18(navController) }
                    composable("Exercise93") { Exercise93(navController) }

                    //Project19
                    composable("CoverP19") { CoverP19(navController) }
                    composable("Exercise95") { Exercise95(navController) }

                    //Project20
                    composable("CoverP20") { CoverP20(navController) }
                    composable("Exercise97") { Exercise97(navController) }

                    //Project21
                    composable("CoverP21") { CoverP21(navController) }
                    composable("Exercise103") { Exercise103(navController) }
                    composable("Exercise104") { Exercise104(navController) }


                    //Project22
                    composable("CoverP22") { CoverP22(navController) }
                    composable("Exercise107") { Exercise107(navController) }
                    composable("Exercise108") { Exercise108(navController) }


                    //Project23
                    composable("CoverP23") { CoverP23(navController) }
                    composable("Exercise111") { Exercise111(navController) }

                    //Project24
                    composable("CoverP24") { CoverP24(navController) }
                    composable("Exercise115") { Exercise115(navController) }
                    composable("Exercise116") { Exercise116(navController) }

                    //Project25
                    composable("CoverP25") { CoverP25(navController) }
                    composable("Exercise118") { Exercise118(navController) }

                    //Project26
                    composable("CoverP26") { CoverP26(navController) }
                    composable("Exercise121") { Exercise121(navController) }

                    //Project27
                    composable("CoverP27") { CoverP27(navController) }
                    composable("Exercise124") { Exercise124(navController) }

                    //Project28
                    composable("CoverP28") { CoverP28(navController) }
                    composable("Exercise125") { Exercise125(navController) }
                    composable("Exercise126") { Exercise126(navController) }

                    //Project29
                    composable("CoverP29") { CoverP29(navController) }
                    composable("Exercise130") { Exercise130(navController) }

                    //Project30
                    composable("CoverP30") { CoverP30(navController) }
                    composable("Exercise133") { Exercise133(navController) }

                    //Project31
                    composable("CoverP31") { CoverP31(navController) }
                    composable("Exercise136") { Exercise136(navController) }

                    //Project32
                    composable("CoverP32") { CoverP32(navController) }
                    composable("Exercise139") { Exercise139(navController) }

                    //Project33
                    composable("CoverP33") { CoverP33(navController) }
                    composable("Exercise141") { Exercise141(navController) }

                    //Project34
                    composable("CoverP34") { CoverP34(navController) }
                    composable("Exercise142") { Exercise142(navController) }

                    //Project35
                    composable("CoverP35") { CoverP35(navController) }
                    //composable("Exercise142") { Exercise142(navController) }
                    //composable("Exercise142") { Exercise142(navController) }
                }
            }
        }
    }
}
