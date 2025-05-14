package com.compose.app.util

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
expect object WindowManager {

    @Composable
    fun getStatusBarHeight(): Dp

    @Composable
    fun getNavigationBarHeight(): Dp
}