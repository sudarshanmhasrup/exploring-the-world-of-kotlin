package com.compose.app.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp

@Composable
private fun BoxScope.SystemWindowGlass(
    height: Dp,
    alignment: Alignment,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .alpha(alpha = 0.8f)
            .align(alignment = alignment)
            .background(color = backgroundColor)
            .height(height)
    )
}