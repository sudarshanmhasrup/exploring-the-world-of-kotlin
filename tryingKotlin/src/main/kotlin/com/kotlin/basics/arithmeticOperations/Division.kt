package com.kotlin.basics.arithmeticOperations

@Suppress("SameParameterValue")
private fun division(firstNumber: Int, secondNumber: Int): Float {
    return firstNumber.toFloat() / secondNumber
}

fun main() {
    val result =  division(firstNumber = 10, secondNumber = 7)
    println("10 divided by 7 is: $result.")
}