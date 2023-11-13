package com.example.voyager

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen

class WhiteScreen: Screen {
    @Composable
    override fun Content() {
        Screen()
    }
}

@Composable
private fun Screen() {
    Box(modifier = Modifier.background(Color.White)) {
        Text(text = "White Screen", fontSize = 40.sp)
    }
}