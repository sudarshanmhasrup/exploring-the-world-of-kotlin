package com.compose.app.extensions

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

internal fun Modifier.backgroundContainerModifier(color: Color): Modifier {
    return this
        .background(color = color)
        .fillMaxSize()
}