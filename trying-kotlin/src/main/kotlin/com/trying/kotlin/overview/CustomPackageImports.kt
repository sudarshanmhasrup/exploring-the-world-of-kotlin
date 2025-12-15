package com.trying.kotlin.overview

import java.awt.BorderLayout
import java.awt.Color
import javax.swing.JLabel as NativeLabel // Importing JLabel and renaming it as NativeLabel
import javax.swing.JPanel as NativePanel // Importing JPanel and renaming it as NativePanel
import javax.swing.JFrame as NativeFrame // Importing JFrame and renaming it as NativeFrame

fun main() {
    val nativeFrame = NativeFrame()
    nativeFrame.title = "Hello World!"
    nativeFrame.isVisible = true
    nativeFrame.background = Color.WHITE
    nativeFrame.setSize(300, 200)

    val nativeLabel = NativeLabel("Hello World!")
    nativeLabel.horizontalAlignment = NativeLabel.CENTER
    nativeLabel.verticalAlignment = NativeLabel.CENTER

    val nativePanel = NativePanel(BorderLayout())
    nativePanel.background = Color.WHITE
    nativePanel.add(nativeLabel, BorderLayout.CENTER)

    nativeFrame.add(nativePanel)
}