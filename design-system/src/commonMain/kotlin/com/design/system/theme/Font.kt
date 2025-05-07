package com.design.system.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import org.jetbrains.compose.resources.Font
import com.design.system.design_system.generated.resources.Res
import com.design.system.design_system.generated.resources.poppins_bold
import com.design.system.design_system.generated.resources.poppins_medium
import com.design.system.design_system.generated.resources.poppins_regular
import com.design.system.design_system.generated.resources.poppins_semi_bold

@Composable
internal fun getPoppinsFontFamily(): FontFamily {
    return FontFamily(
        Font(Res.font.poppins_regular, FontWeight.Normal),
        Font(Res.font.poppins_medium, FontWeight.Medium),
        Font(Res.font.poppins_semi_bold, FontWeight.SemiBold),
        Font(Res.font.poppins_bold, FontWeight.Bold)
    )
}