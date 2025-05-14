package com.compose.app.util

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.statusBars
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual object WindowManager {

    @Composable
    actual fun getStatusBarHeight(): Dp {
        return with(LocalDensity.current) {
            WindowInsets.statusBars.getTop(this).toDp()
        }
    }

    @Composable
    actual fun getNavigationBarHeight(): Dp {
        return with(LocalDensity.current) {
            WindowInsets.navigationBars.getBottom(this).toDp()
        }
    }
}