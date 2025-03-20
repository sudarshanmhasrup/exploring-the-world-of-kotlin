package com.kotlin.basics.nullability

@Suppress("KotlinConstantConditions")
fun main() {
    var favoriteActor: String? = "Chris Hemsworth"
    println(favoriteActor?.length)

    favoriteActor = null
    println(favoriteActor?.length)
}