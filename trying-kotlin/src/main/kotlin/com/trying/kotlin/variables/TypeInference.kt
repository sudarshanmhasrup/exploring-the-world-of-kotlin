package com.trying.kotlin.variables

@Suppress("RedundantExplicitType")
fun main() {
    // Smart way
    val message = "Hello World."

    // Not so-smart way
    val greetings: String = "Good morning!"

    println(message)
    println(greetings)
}