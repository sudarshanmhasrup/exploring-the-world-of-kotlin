package com.kotlin.basics.conditionals

@Suppress("KotlinConstantConditions")
fun main() {
    val trafficLightColor = "Green"

    when(trafficLightColor) {
        "Red" -> println("Stop.")
        "Yellow" -> println("Go slow.")
        "Green" -> println("Go.")
        else -> println("Invalid traffic-light color.")
    }
}