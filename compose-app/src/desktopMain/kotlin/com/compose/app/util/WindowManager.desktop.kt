package com.compose.app.util

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual object WindowManager {

    @Composable
    actual fun getStatusBarHeight(): Dp {
        return 0.dp
    }

    @Composable
    actual fun getNavigationBarHeight(): Dp {
       return 0.dp
    }
}