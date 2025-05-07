package com.design.system.api

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.design.system.colorScheme.Colors
import com.design.system.platform.Platform
import com.design.system.typography.Typography

object ComposeAppTheme {
    val colors: Colors
        @Composable
        get() = LocalColors.current
    val typography: Typography
        @Composable
        get() = LocalTypography.current
    val platform: Platform
        @Composable
        get() = LocalPlatform.current
}

@Composable
fun ComposeAppTheme(
    colors: Colors,
    typography: Typography,
    platform: Platform,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalColors provides colors,
        LocalTypography provides typography,
        LocalPlatform provides platform
    ) {
        content()
    }
}