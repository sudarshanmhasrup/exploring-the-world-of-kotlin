package com.kotlin.basics.functions

private fun defaultArguments(parameter1: String = "Kotlin", parameter2: String) {
    println("The value of parameter 1: $parameter1.")
    println("The value of parameter 2: $parameter2.")
}

fun main() {
    defaultArguments(parameter2 = "Java")
}