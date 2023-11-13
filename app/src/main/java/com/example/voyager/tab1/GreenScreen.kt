package com.example.voyager.tab1

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
import com.example.voyager.YellowScreen

class GreenScreen: Screen {
    @Composable
    override fun Content() {
        Screen()
    }

}

@Composable
private fun Screen() {
    val navigator = LocalNavigator.currentOrThrow.parent!!.parent!!
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Green)) {
        Button(onClick = { navigator.push(YellowScreen()) }) {
            Text(text = "click me")
        }
        Text(text = "Green Screen", fontSize = 40.sp)
    }
}