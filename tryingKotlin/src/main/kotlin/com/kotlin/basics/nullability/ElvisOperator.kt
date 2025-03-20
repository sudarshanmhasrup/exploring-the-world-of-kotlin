package com.kotlin.basics.nullability

@Suppress("KotlinConstantConditions")
fun main() {
    val favoriteActor: String? = null
    val lengthOfName = favoriteActor?.length ?: 0

    println("The number of characters in your favorite actor's name is $lengthOfName.")
}