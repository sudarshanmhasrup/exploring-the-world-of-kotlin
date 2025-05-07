package com.design.system.theme

import androidx.compose.runtime.Composable
import com.design.system.api.ComposeAppTheme
import com.design.system.colorScheme.Colors

private val lightColorScheme = Colors(
    backgroundColor = backgroundColorLight,
    primaryColor = primaryColorLight,
    secondaryColor = secondaryColorLight,
    primaryFontColor = primaryFontColorLight,
    secondaryFontColor = secondaryFontColorLight
)

private val darkColorScheme = Colors()

@Composable
fun CmpAppTheme(
    isDarkMode: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = if (isDarkMode) darkColorScheme else lightColorScheme
    val typography = getTypography()
    ComposeAppTheme(
        colors = colorScheme,
        typography = typography,
        content = content
    )
}