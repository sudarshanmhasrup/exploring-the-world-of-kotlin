package com.trying.kotlin.conditionals

@Suppress("KotlinConstantConditions")
fun main() {

    val age = 21

    if (age <= 18) {
        println("You're a minor!")
    } else {
        println("You're an adult!")
    }
}