package com.kotlin.basics.conditionals

@Suppress("KotlinConstantConditions")
fun main() {
    val x = 10
    when(x) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
        else -> println("x isn't a prime number between 1 and 10.")
    }
}