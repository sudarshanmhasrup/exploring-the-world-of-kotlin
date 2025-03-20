package com.kotlin.basics.conditionals

@Suppress("KotlinConstantConditions")
fun main() {
    val trafficLightColor = "Green"

    val message = when(trafficLightColor) {
        "Red" -> "Stop."
        "Yellow" -> "Slow."
        "Green" -> "Go."
        else -> "Invalid traffic-light color."
    }
    println(message)
}