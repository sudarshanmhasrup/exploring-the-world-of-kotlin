package com.kotlin.basics.nullability

@Suppress("KotlinConstantConditions", "RedundantNullableReturnType")
fun main() {
    val favoriteActor: String? = "Chris Hemsworth"
    if (favoriteActor != null) {
        println("Your favorite actor is: $favoriteActor")
    } else {
        println("You don't have any favorite actor!")
    }
}