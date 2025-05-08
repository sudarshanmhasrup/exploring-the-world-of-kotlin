package com.shared.components.buttons

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.design.system.api.ComposeAppTheme
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.StringResource
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@Composable
fun PrimaryButton(
    label: StringResource,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    isOutlined: Boolean = false,
    icon: DrawableResource? = null,
    onClick: () -> Unit
) {
    val backgroundColor = if (isOutlined) {
        Color.Transparent
    } else {
        ComposeAppTheme.colors.primaryColor
    }
    val contentColor = if (isOutlined) {
        ComposeAppTheme.colors.primaryColor
    } else {
        Color.White
    }
    val borderStroke = if (isOutlined) {
        BorderStroke(
            width = 1.dp,
            color = ComposeAppTheme.colors.primaryColor
        )
    } else {
        BorderStroke(
            width = 0.dp,
            color = Color.Transparent,
        )
    }

    val backgroundContainerModifier = modifier
        .semantics { Role.Button }
        .clip(shape = RoundedCornerShape(size = 100.dp))
        .border(border = borderStroke, shape = RoundedCornerShape(size = 100.dp))
        .clickable(enabled = enabled, onClick = onClick)
        .background(color = backgroundColor)
        .padding(all = 24.dp)

    val buttonLabelStyle = ComposeAppTheme.typography.labelLargeSemiBold.copy(
        textAlign = TextAlign.Center,
        color = contentColor
    )

    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = backgroundContainerModifier
    ) {
        if (icon != null) {
            Image(
                painter = painterResource(resource = icon),
                contentScale = ContentScale.Crop,
                contentDescription = null,
                modifier = Modifier.width(20.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
        }
        BasicText(
            text = stringResource(resource = label),
            style = buttonLabelStyle,
            maxLines = 1
        )
    }
}