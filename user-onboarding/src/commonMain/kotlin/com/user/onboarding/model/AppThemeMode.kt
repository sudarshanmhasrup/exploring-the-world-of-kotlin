package com.user.onboarding.model

import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.StringResource

data class AppThemeMode(
    val icon: DrawableResource,
    val label: StringResource,
    val themeMode: ThemeMode,
    val isSelected: Boolean = false,
)