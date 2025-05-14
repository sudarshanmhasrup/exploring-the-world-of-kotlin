package com.compose.app.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import cafe.adriel.voyager.core.screen.Screen
import com.compose.app.extensions.backgroundContainerModifier
import com.compose.app.extensions.composeAppModifier
import com.compose.app.presentation.components.SystemWindowGlass
import com.compose.app.util.WindowManager

class ComposeApp: Screen {

    @Composable
    override fun Content() {
        val backgroundColor = Color.White
        val statusBarHeight = WindowManager.getNavigationBarHeight()
        Box(modifier = Modifier.backgroundContainerModifier(color = backgroundColor)) {
            Column(modifier = Modifier.composeAppModifier(topPadding = statusBarHeight)) {

            }
            SystemWindowGlasses(modifier = Modifier.fillMaxSize())
        }
    }

    @Composable
    private fun SystemWindowGlasses(modifier: Modifier = Modifier) {
        Box(modifier = modifier) {
            // System window glass for status bar
            SystemWindowGlass(
                height = WindowManager.getStatusBarHeight(),
                alignment = Alignment.TopCenter,
                backgroundColor = Color.Yellow,
                modifier = Modifier.fillMaxWidth()
            )
            // System window glass for navigation bar
            SystemWindowGlass(
                height = WindowManager.getNavigationBarHeight(),
                alignment = Alignment.BottomCenter,
                backgroundColor = Color.Green,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}