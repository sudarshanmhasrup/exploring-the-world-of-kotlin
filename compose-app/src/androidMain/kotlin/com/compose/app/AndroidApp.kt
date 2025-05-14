package com.compose.app

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.Navigator
import com.compose.app.presentation.ComposeApp

class AndroidApp : Screen {

    @Composable
    override fun Content() {
        Navigator(screen = ComposeApp())
    }
}