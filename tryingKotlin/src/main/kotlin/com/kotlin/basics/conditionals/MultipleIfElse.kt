package com.kotlin.basics.conditionals

@Suppress("KotlinConstantConditions", "CascadeIf")
fun main() {
    val trafficLightColor = "Red"

    if (trafficLightColor == "Red") {
        println("Stop.")
    } else if (trafficLightColor == "Yellow") {
        println("Go slow.")
    } else if (trafficLightColor == "Green") {
        println("Go.")
    } else {
        println("Invalid traffic-light color.")
    }
}