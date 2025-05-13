package com.trying.kotlin.functions

@Suppress("SameParameterValue")
private fun addition(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}

fun main() {
    val result = addition(firstNumber = 20, secondNumber = 20)
    println("20 + 20 = $result.")
}