package com.kotlin.basics.arithmeticOperations

@Suppress("SameParameterValue")
private fun subtraction(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}

fun main() {
    val result = subtraction(firstNumber = 70, secondNumber = 10)
    println("Subtraction of 70 and 10 is: $result.")
}