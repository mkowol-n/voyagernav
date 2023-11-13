package com.example.voyager

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.LocalTabNavigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabNavigator
import cafe.adriel.voyager.navigator.tab.TabOptions

@Composable
fun MainScreen() {
    TabNavigator(
        tab = SceenATab
    ) {
        Scaffold(
            bottomBar = {
                BottomNavigation {
                    TabNavigationItem(SceenATab)
                    TabNavigationItem(SceenBTab)
                }
            }
        ) {
            Box(modifier = Modifier.padding(it)) {
                CurrentTab()
            }
        }
    }
}

object SceenATab: Tab {
    override val options: TabOptions
        @Composable
        get() {
            val title = "ScreenA"
            val icon = rememberVectorPainter(Icons.Default.Home)

            return remember {
                TabOptions(
                    index = 0u,
                    title = title,
                    icon = icon
                )
            }
        }

    @Composable
    override fun Content() {
        Navigator(BlackScreen())
    }
}

object SceenBTab: Tab {
    override val options: TabOptions
        @Composable
        get() {
            val title = "ScreenA"
            val icon = rememberVectorPainter(Icons.Default.Face)

            return remember {
                TabOptions(
                    index = 1u,
                    title = title,
                    icon = icon
                )
            }
        }

    @Composable
    override fun Content() {
        Navigator(RedScreen())
    }
}

@Composable
private fun RowScope.TabNavigationItem(tab: Tab) {
    val tabNavigator = LocalTabNavigator.current

    BottomNavigationItem(
        selected = tabNavigator.current == tab,
        onClick = { tabNavigator.current = tab },
        icon = { Icon(painter = tab.icon!!, contentDescription = tab.title) }
    )
}