package com.compose.desktop

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.WindowState
import java.awt.Toolkit
import kotlin.system.exitProcess

// Lambda function to exit application
val exitApp: () -> Unit = {
    exitProcess(0)
}

@Composable
fun windowContainer(modifier: Modifier = Modifier) {

    val backgroundContainerModifier = Modifier.padding(
        bottom = 40.dp
    )

    // Custom background container for window
    Column(
        modifier = backgroundContainerModifier
    ) {

    }
}

@Composable
fun initApp(modifier: Modifier = Modifier) {

    val windowToolkit = Toolkit.getDefaultToolkit().screenSize
    val windowWidth = windowToolkit.width.dp
    val windowHeight = windowToolkit.height.dp

    val windowState = WindowState(
        width = windowWidth,
        height = windowHeight,
        position = WindowPosition(
            alignment = Alignment.Center
        )
    )

    Window(
        onCloseRequest = exitApp,
        state = windowState,
        undecorated = true
    ) {
        windowContainer(
            modifier = modifier
        )
    }
}