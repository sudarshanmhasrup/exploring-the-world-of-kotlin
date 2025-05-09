package com.user.onboarding.data

import com.user.onboarding.model.AppThemeMode
import com.user.onboarding.model.ThemeMode
import com.user.onboarding.user_onboarding.generated.resources.Res
import com.user.onboarding.user_onboarding.generated.resources.app_theme_mode_1_label
import com.user.onboarding.user_onboarding.generated.resources.app_theme_mode_2_label
import com.user.onboarding.user_onboarding.generated.resources.app_theme_mode_3_label
import com.user.onboarding.user_onboarding.generated.resources.ic_dark_mode_theme
import com.user.onboarding.user_onboarding.generated.resources.ic_light_mode_theme
import com.user.onboarding.user_onboarding.generated.resources.ic_system_default_theme

internal object AppThemeModeList {

    private val appThemeModeList = listOf(
        AppThemeMode(
            icon = Res.drawable.ic_system_default_theme,
            label = Res.string.app_theme_mode_1_label,
            themeMode = ThemeMode.SYSTEM_DEFAULT,
            isSelected = true
        ),
        AppThemeMode(
            icon = Res.drawable.ic_light_mode_theme,
            label = Res.string.app_theme_mode_2_label,
            themeMode = ThemeMode.LIGHT
        ),
        AppThemeMode(
            icon = Res.drawable.ic_dark_mode_theme,
            label = Res.string.app_theme_mode_3_label,
            themeMode = ThemeMode.DARK
        )
    )

    fun getAppThemeModeList(): List<AppThemeMode> {
        return appThemeModeList
    }
}