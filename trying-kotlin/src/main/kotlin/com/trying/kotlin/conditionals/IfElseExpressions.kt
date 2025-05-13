package com.trying.kotlin.conditionals

private fun displayMood(mood: String) {
    println(mood)
}

@Suppress("KotlinConstantConditions")
fun main() {

    val weather = "Pretty"

    val message = if (weather == "Pretty") {
        "I'm happy!"
    } else {
        "I'm sad!"
    }

    displayMood(mood = message)
}