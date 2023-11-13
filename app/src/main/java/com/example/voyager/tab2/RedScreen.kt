package com.example.voyager.tab2

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

class RedScreen: Screen {
    @Composable
    override fun Content() {
        Screen()
    }

}

@Composable
private fun Screen() {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Red)) {
        val navigator = LocalNavigator.currentOrThrow
        Button(onClick = {
            navigator.push(WhiteScreen())
        }) {
            Text(text = "click me", color = Color.Yellow)
        }
        Text(text = "Red Screen", fontSize = 40.sp)
    }
}