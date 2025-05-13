package com.trying.kotlin.functions

@Suppress("SameParameterValue")
private fun display(message: String) {
    println(message)
}

fun main() {
    display(message = "Hello World!")
}