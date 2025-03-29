package com.kotlin.basics.lambdas

private fun display(message: String) {
    println(message)
}

fun main() {
    val displayMessage = ::display
    displayMessage("Hello World!")
}