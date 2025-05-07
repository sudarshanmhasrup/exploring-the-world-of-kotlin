package com.design.system.platform

import androidx.compose.runtime.Immutable
import com.platform.apis.model.DevicePlatform

@Immutable
data class Platform(
    val currentPlatform: DevicePlatform = DevicePlatform.NONE
)