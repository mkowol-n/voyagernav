package com.example.voyager

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow

class BlackScreen: Screen {
    @Composable
    override fun Content() {
        Screen()
    }

}

@Composable
private fun Screen() {
    val navigator = LocalNavigator.currentOrThrow
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Button(onClick = {
            navigator.push(GreenScreen())
        }) {
            Text(text = "click me", color = Color.Yellow)
        }
        Text(text = "Black Screen", fontSize = 40.sp, color = Color.White)
    }
}