package com.kotlin.basics.arithmeticOperations

@Suppress("SameParameterValue")
private fun addition(firstNumber: Int, lastNumber: Int): Int {
    return firstNumber + lastNumber
}

fun main() {
    val result = addition(firstNumber = 10, lastNumber = 50)
    println("Addition of 10 and 50: $result.")
}