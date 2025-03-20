package com.kotlin.basics.nullability

fun main() {
    var favoriteActor: String? = "Chris Hemsworth"
    println(favoriteActor)

    favoriteActor = null
    println(favoriteActor)
}