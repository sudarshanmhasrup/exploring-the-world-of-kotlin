package com.kotlin.basics.arithmeticOperations

@Suppress("SameParameterValue")
private fun multiplication(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber * secondNumber
}

fun main() {
    val result = multiplication(firstNumber = 10, secondNumber = 20)
    println("Multiplication of 10 and 20 is: $result.")
}