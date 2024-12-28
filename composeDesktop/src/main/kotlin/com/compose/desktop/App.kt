package com.compose.desktop

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import com.compose.desktop.view.emailAddressValidatorPage.emailAddressValidatorPage
import kotlin.system.exitProcess


// Lambda function to exit application
val exitApp: () -> Unit = {
    exitProcess(0)
}

@Composable
fun initApp(modifier: Modifier = Modifier) {

    val windowState = WindowState(
        isMinimized = false
    )

    Window(
        onCloseRequest = exitApp,
        state = windowState
    ) {
        emailAddressValidatorPage(
            modifier = modifier
        )
    }
}