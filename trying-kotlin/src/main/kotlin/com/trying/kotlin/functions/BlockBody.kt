package com.trying.kotlin.functions

// Function with block body
private fun getMessage(): String {
    return "Hello World!"
}

fun main() {
    val message = getMessage()
    println(message)
}