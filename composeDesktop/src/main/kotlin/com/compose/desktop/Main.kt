package com.compose.desktop

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import com.compose.desktop.view.emailAddressValidatorPage.emailAddressValidatorPage
import kotlin.system.exitProcess

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

fun main() = application {
    initApp()
}