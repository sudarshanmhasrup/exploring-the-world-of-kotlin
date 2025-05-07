package com.compose.app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import cafe.adriel.voyager.core.screen.Screen
import com.compose.app.extensions.backgroundContainerModifier
import com.design.system.api.ComposeAppTheme
import com.design.system.theme.CmpAppTheme

internal class ComposeApp(private val statusBarHeight: Dp) : Screen {

    @Composable
    override fun Content() {
        CmpAppTheme {
            val backgroundColor = ComposeAppTheme.colors.backgroundColor
            Box(modifier = Modifier.fillMaxSize()) {
                Column(modifier = Modifier.backgroundContainerModifier(color = backgroundColor)) {
                }
                StatusBarGlass(
                    backgroundColor = backgroundColor,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }

    @Composable
    private fun BoxScope.StatusBarGlass(
        backgroundColor: Color,
        modifier: Modifier = Modifier
    ) {
        Box(
            modifier = modifier
                .alpha(alpha = 0.8f)
                .align(alignment = Alignment.TopCenter)
                .background(color = backgroundColor)
                .height(statusBarHeight)
        )
    }
}