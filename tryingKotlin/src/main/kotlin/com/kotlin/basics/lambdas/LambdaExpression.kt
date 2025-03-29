package com.kotlin.basics.lambdas

private val display = {
    println("Hello World!")
}

fun main() {
    val displayHelloWorld = display
    displayHelloWorld()
}