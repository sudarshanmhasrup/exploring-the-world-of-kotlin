package com.kotlin.basics.oop

private open class LivingBeing(
    private val name: String,
    private val category: String
) {
    fun walk() {
        println("I have the ability to walk.")
    }

    fun eat() {
        println("I need food to survive.")
    }

    fun sleep() {
        println("I require rest to function properly.")
    }

    fun introduce() {
        println("Hello! My name is $name, and I belong to the $category category.")
    }
}

private class Human(name: String): LivingBeing(name = name, category = "Human") {

    fun sing() {
        println("I can sing a song for you.")
    }

    fun speak() {
        println("I can speak.")
    }
}

private class Dog(name: String): LivingBeing(name = name, category = "Animal (Dog)") {

    fun bark() {
        println("I can bark.")
    }
}

fun main() {
    val rahul = Human(name = "Rahul")
    rahul.introduce()
    rahul.walk()
    rahul.eat()
    rahul.sleep()
    rahul.sing()
    rahul.speak()
    println()

    val bruno = Dog(name = "Bruno")
    bruno.introduce()
    bruno.walk()
    bruno.eat()
    bruno.sleep()
    bruno.bark()
}