package com.design.system.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.design.system.typography.Typography

@Composable
internal fun getTypography(): Typography {
    val fontFamily = getPoppinsFontFamily()

    val displayLarge = TextStyle(
        fontFamily = fontFamily,
        fontSize = 57.sp,
        lineHeight = 64.sp,
        letterSpacing = (-0.25).sp,
        fontWeight = FontWeight.Normal
    )
    val displayMedium = TextStyle(
        fontFamily = fontFamily,
        fontSize = 45.sp,
        lineHeight = 52.sp,
        letterSpacing = 0.sp,
        fontWeight = FontWeight.Normal
    )
    val displaySmall = TextStyle(
        fontFamily = fontFamily,
        fontSize = 36.sp,
        lineHeight = 44.sp,
        letterSpacing = 0.sp,
        fontWeight = FontWeight.Normal
    )
    val headlineLarge = TextStyle(
        fontFamily = fontFamily,
        fontSize = 32.sp,
        lineHeight = 40.sp,
        letterSpacing = 0.sp,
        fontWeight = FontWeight.Normal
    )
    val headlineMedium = TextStyle(
        fontFamily = fontFamily,
        fontSize = 28.sp,
        lineHeight = 36.sp,
        letterSpacing = 0.sp,
        fontWeight = FontWeight.Normal
    )
    val headlineSmall = TextStyle(
        fontFamily = fontFamily,
        fontSize = 24.sp,
        lineHeight = 32.sp,
        letterSpacing = 0.sp,
        fontWeight = FontWeight.Normal
    )
    val titleLarge = TextStyle(
        fontFamily = fontFamily,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp,
        fontWeight = FontWeight.Normal
    )
    val titleMedium = TextStyle(
        fontFamily = fontFamily,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.15.sp,
        fontWeight = FontWeight.Normal
    )
    val titleSmall = TextStyle(
        fontFamily = fontFamily,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp,
        fontWeight = FontWeight.Normal
    )
    val bodyLarge = TextStyle(
        fontFamily = fontFamily,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp,
        fontWeight = FontWeight.Normal
    )
    val bodyMedium = TextStyle(
        fontFamily = fontFamily,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.25.sp,
        fontWeight = FontWeight.Normal
    )
    val bodySmall = TextStyle(
        fontFamily = fontFamily,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.4.sp,
        fontWeight = FontWeight.Normal
    )
    val labelLarge = TextStyle(
        fontFamily = fontFamily,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp,
        fontWeight = FontWeight.Normal
    )
    val labelMedium = TextStyle(
        fontFamily = fontFamily,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp,
        fontWeight = FontWeight.Normal
    )
    val labelSmall = TextStyle(
        fontFamily = fontFamily,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp,
        fontWeight = FontWeight.Normal
    )

    return Typography(
        // Regular
        displayLarge = displayLarge,
        displayMedium = displayMedium,
        displaySmall = displaySmall,
        headlineLarge = headlineLarge,
        headlineMedium = headlineMedium,
        headlineSmall = headlineSmall,
        titleLarge = titleLarge,
        titleMedium = titleMedium,
        titleSmall = titleSmall,
        bodyLarge = bodyLarge,
        bodyMedium = bodyMedium,
        bodySmall = bodySmall,
        labelLarge = labelLarge,
        labelMedium = labelMedium,
        labelSmall = labelSmall,

        // Medium
        displayLargeMedium = displayLarge.copy(fontWeight = FontWeight.Medium),
        displayMediumMedium = displayMedium.copy(fontWeight = FontWeight.Medium),
        displaySmallMedium = displaySmall.copy(fontWeight = FontWeight.Medium),
        headlineLargeMedium = headlineLarge.copy(fontWeight = FontWeight.Medium),
        headlineMediumMedium = headlineMedium.copy(fontWeight = FontWeight.Medium),
        headlineSmallMedium = headlineSmall.copy(fontWeight = FontWeight.Medium),
        titleLargeMedium = titleLarge.copy(fontWeight = FontWeight.Medium),
        titleMediumMedium = titleMedium.copy(fontWeight = FontWeight.Medium),
        titleSmallMedium = titleSmall.copy(fontWeight = FontWeight.Medium),
        bodyLargeMedium = bodyLarge.copy(fontWeight = FontWeight.Medium),
        bodyMediumMedium = bodyMedium.copy(fontWeight = FontWeight.Medium),
        bodySmallMedium = bodySmall.copy(fontWeight = FontWeight.Medium),
        labelLargeMedium = labelLarge.copy(fontWeight = FontWeight.Medium),
        labelMediumMedium = labelMedium.copy(fontWeight = FontWeight.Medium),
        labelSmallMedium = labelSmall.copy(fontWeight = FontWeight.Medium),

        // SemiBold
        displayLargeSemiBold = displayLarge.copy(fontWeight = FontWeight.SemiBold),
        displayMediumSemiBold = displayMedium.copy(fontWeight = FontWeight.SemiBold),
        displaySmallSemiBold = displaySmall.copy(fontWeight = FontWeight.SemiBold),
        headlineLargeSemiBold = headlineLarge.copy(fontWeight = FontWeight.SemiBold),
        headlineMediumSemiBold = headlineMedium.copy(fontWeight = FontWeight.SemiBold),
        headlineSmallSemiBold = headlineSmall.copy(fontWeight = FontWeight.SemiBold),
        titleLargeSemiBold = titleLarge.copy(fontWeight = FontWeight.SemiBold),
        titleMediumSemiBold = titleMedium.copy(fontWeight = FontWeight.SemiBold),
        titleSmallSemiBold = titleSmall.copy(fontWeight = FontWeight.SemiBold),
        bodyLargeSemiBold = bodyLarge.copy(fontWeight = FontWeight.SemiBold),
        bodyMediumSemiBold = bodyMedium.copy(fontWeight = FontWeight.SemiBold),
        bodySmallSemiBold = bodySmall.copy(fontWeight = FontWeight.SemiBold),
        labelLargeSemiBold = labelLarge.copy(fontWeight = FontWeight.SemiBold),
        labelMediumSemiBold = labelMedium.copy(fontWeight = FontWeight.SemiBold),
        labelSmallSemiBold = labelSmall.copy(fontWeight = FontWeight.SemiBold),

        // Bold
        displayLargeBold = displayLarge.copy(fontWeight = FontWeight.Bold),
        displayMediumBold = displayMedium.copy(fontWeight = FontWeight.Bold),
        displaySmallBold = displaySmall.copy(fontWeight = FontWeight.Bold),
        headlineLargeBold = headlineLarge.copy(fontWeight = FontWeight.Bold),
        headlineMediumBold = headlineMedium.copy(fontWeight = FontWeight.Bold),
        headlineSmallBold = headlineSmall.copy(fontWeight = FontWeight.Bold),
        titleLargeBold = titleLarge.copy(fontWeight = FontWeight.Bold),
        titleMediumBold = titleMedium.copy(fontWeight = FontWeight.Bold),
        titleSmallBold = titleSmall.copy(fontWeight = FontWeight.Bold),
        bodyLargeBold = bodyLarge.copy(fontWeight = FontWeight.Bold),
        bodyMediumBold = bodyMedium.copy(fontWeight = FontWeight.Bold),
        bodySmallBold = bodySmall.copy(fontWeight = FontWeight.Bold),
        labelLargeBold = labelLarge.copy(fontWeight = FontWeight.Bold),
        labelMediumBold = labelMedium.copy(fontWeight = FontWeight.Bold),
        labelSmallBold = labelSmall.copy(fontWeight = FontWeight.Bold)
    )
}