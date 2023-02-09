package com.crewl.app.utils

import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.SystemUiController

@Composable
fun SetupSystemUI(systemUiController: SystemUiController, systemColor: Color) {
    SideEffect {
        systemUiController.setSystemBarsColor(color = systemColor)
    }
}