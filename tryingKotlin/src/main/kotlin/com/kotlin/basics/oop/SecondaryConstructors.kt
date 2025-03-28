package com.kotlin.basics.oop

private class SecondaryConstructors(
    private val name: String
) {

    private var age: Int? = null

    constructor(name: String, age: Int): this(name = name) {
        this.age = age
    }

    fun displayInformation() {
        println("Name: $name.")
        if (age != null) {
            println("Age: $age.")
        }
    }
}

fun main() {
    val secondaryConstructors = SecondaryConstructors(name = "Sudarshan Mhasrup", age = 21)
    secondaryConstructors.displayInformation()
}