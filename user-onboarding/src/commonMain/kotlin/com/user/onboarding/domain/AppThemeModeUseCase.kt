package com.user.onboarding.domain

import com.user.onboarding.data.AppThemeModeList
import com.user.onboarding.model.AppThemeMode

object AppThemeModeUseCase {
    fun getAppThemeModeList(): List<AppThemeMode> {
        return AppThemeModeList.getAppThemeModeList()
    }
}