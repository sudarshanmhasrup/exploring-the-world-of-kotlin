package com.kotlin.basics.nullability

@Suppress("KotlinConstantConditions")
fun main() {
    val favoriteActor: String? = null
    println(favoriteActor!!.length) // Throws NullPointerException
}