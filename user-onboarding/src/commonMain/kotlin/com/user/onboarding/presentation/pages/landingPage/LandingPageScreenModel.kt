package com.user.onboarding.presentation.pages.landingPage

import cafe.adriel.voyager.core.model.ScreenModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

internal class LandingPageScreenModel : ScreenModel {

    private var _landingPageUiState = MutableStateFlow(LandingPageUiState())
    val landingPageUiState = _landingPageUiState.asStateFlow()

    fun updateLandingPageScreenWidth(width: Double) {
        _landingPageUiState.value = _landingPageUiState.value.copy(landingPageWidth = width)
    }
}