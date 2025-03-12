package com.kotlin.basics.functions

private fun namedArguments(parameter1: String, parameter2: String) {
    println("The value of parameter 1: $parameter1.")
    println("The value of parameter 2: $parameter2.")
}

fun main() {
    namedArguments(parameter1 = "C++", parameter2 = "Kotlin")
    namedArguments(parameter2 = "Java", parameter1 = "Swift")
}