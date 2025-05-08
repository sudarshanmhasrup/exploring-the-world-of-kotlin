package com.user.onboarding.extensions

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
internal fun Modifier.landingPageImageModifier(): Modifier {
    return this.fillMaxWidth().padding(all = 20.dp)
}

@Composable
internal fun Modifier.landingPageGreetingAndMessageModifier(width: Double): Modifier {
    return this
        .fillMaxWidth()
        .landingPageGreetingPadding(width = width)
}

@Composable
internal fun Modifier.landingPageGreetingPadding(width: Double): Modifier {
    val widthInNumber = width.toInt()
    return when {
        // Break-point for tablets
        widthInNumber in 760..1199 -> {
            val paddingStartAndEnd = (width * 0.15).dp
            padding(start = paddingStartAndEnd, end = paddingStartAndEnd, top = 120.dp)
        }
        // Break-point for desktop
        widthInNumber >= 1200 -> {
            val paddingStartAndEnd = (width * 0.25).dp
            padding(start = paddingStartAndEnd, end = paddingStartAndEnd, top = 140.dp)
        }
        // Break-point for mobile
        else -> {
            padding(all = 20.dp)
        }
    }
}

@Composable
internal fun Modifier.landingPageButtonsColumnModifier(): Modifier {
    return this
        .fillMaxWidth()
        .padding(all = 20.dp)
}

@Composable
internal fun Modifier.landingPageButtonsRowModifier(): Modifier {
    return this
        .fillMaxWidth()
        .padding(all = 20.dp)
}