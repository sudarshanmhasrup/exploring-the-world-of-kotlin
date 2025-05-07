package com.compose.app.extensions

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

internal fun Modifier.backgroundContainerModifier(
    color: Color,
    scrollState: ScrollState
): Modifier {
    return this
        .background(color = color)
        .fillMaxSize()
        .verticalScroll(state = scrollState)
}