package com.compose.desktop.view.emailAddressValidatorPage

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max
import androidx.compose.ui.unit.sp

@Composable
fun emailAddressValidatorPage(modifier: Modifier = Modifier) {

    val commonModifier = Modifier.fillMaxWidth()

    Column(
        modifier = modifier
    ) {
        emailAddressImageWithTitleAndDescription(
            modifier = commonModifier
        )
        emailAddressTextFieldWithButton(
            modifier = commonModifier
        )
    }
}

@Composable
private fun emailAddressImageWithTitleAndDescription(modifier: Modifier = Modifier) {

    val emailAddressImage = painterResource("assets/email_address_image.png")
    val backgroundContainerModifier = modifier.padding(
        vertical = 24.dp,
        horizontal = 40.dp
    )

    // Background container
    Column(
        modifier = backgroundContainerModifier
    ) {
        Image(
            painter = emailAddressImage,
            contentDescription = "Email address image",
            modifier = modifier.height(80.dp).width(80.dp)
        )

        Spacer(
            modifier = modifier.height(20.dp)
        )

        Text(
            text = "Email Address Validator",
            textAlign = TextAlign.Center,
            modifier = modifier,
            maxLines = 1,
            fontWeight = FontWeight.SemiBold,
            fontSize = 24.sp
        )

        Spacer(
            modifier = modifier.height(8.dp)
        )

        Text(
            text = "Please enter an email address to check if it's a valid email address or not.",
            textAlign = TextAlign.Center,
            modifier = modifier,
            maxLines = 1,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp
        )
    }
}

@Composable
private fun emailAddressTextFieldWithButton(modifier: Modifier = Modifier) {

    var emailAddressInput by remember { mutableStateOf("") }

    val backgroundContainerModifier = modifier.padding(
        horizontal = 440.dp
    )

    val textFieldColors = TextFieldDefaults.outlinedTextFieldColors(
        cursorColor = Color.Black,
        focusedBorderColor = Color.Black,
        focusedLabelColor = Color.Black
    )

    val buttonColors = ButtonDefaults.buttonColors(
        contentColor = Color.White,
        backgroundColor = Color.Black,
        disabledContentColor = Color.White,
        disabledBackgroundColor = Color.Gray
    )

    // Background container
    Column(
        modifier = backgroundContainerModifier
    ) {

        // Email address input field
        OutlinedTextField(
            value = emailAddressInput,
            modifier = modifier,
            colors = textFieldColors,
            singleLine = true,
            onValueChange = { emailAddressInput = it.lowercase() },
            label = {
                Text(
                    text = "Email address"
                )
            }
        )

        Spacer(
            modifier = modifier.height(20.dp)
        )

        Button(
            onClick = {},
            modifier = modifier,
            enabled = "@" in emailAddressInput,
            colors = buttonColors
        ) {
            Text(
                text = "Check validation",
                textAlign = TextAlign.Center,
                modifier = modifier.padding(
                    vertical = 12.dp
                )
            )
        }
    }
}