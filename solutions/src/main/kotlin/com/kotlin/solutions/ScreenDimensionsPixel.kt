package com.kotlin.solutions

import java.awt.Toolkit

fun main() {

    val windowToolkit = Toolkit.getDefaultToolkit().screenSize
    val windowWidth = windowToolkit.width
    val windowHeight = windowToolkit.height

    println("Width: $windowWidth")
    println("Height: $windowHeight")
}