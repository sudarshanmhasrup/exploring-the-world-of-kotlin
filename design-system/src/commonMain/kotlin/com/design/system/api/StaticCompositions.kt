package com.design.system.api

import androidx.compose.runtime.staticCompositionLocalOf
import com.design.system.colorScheme.Colors
import com.design.system.platform.Platform
import com.design.system.typography.Typography

val LocalColors = staticCompositionLocalOf {
    Colors()
}

val LocalTypography = staticCompositionLocalOf {
    Typography()
}

val LocalPlatform = staticCompositionLocalOf {
    Platform()
}