package com.compose.app.extensions

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp

internal fun Modifier.backgroundContainerModifier(color: Color): Modifier {
    return this
        .background(color = color)
        .fillMaxSize()
}

internal fun Modifier.composeAppModifier(topPadding: Dp): Modifier {
    return this
        .fillMaxSize()
        .padding(top = topPadding)
}