package com.user.onboarding.extensions

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
internal fun Modifier.landingPageImageModifier(): Modifier {
    return this
        .fillMaxWidth()
        .padding(all = 20.dp)
}

@Composable
internal fun Modifier.landingPageGreetingAndMessageModifier(): Modifier {
    return this
        .fillMaxWidth()
        .padding(all = 20.dp)
}