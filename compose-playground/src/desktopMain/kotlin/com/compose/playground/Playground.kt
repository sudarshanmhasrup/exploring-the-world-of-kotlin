package com.compose.playground

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(title = "Compose Playground", onCloseRequest = ::exitApplication) {

    }
}