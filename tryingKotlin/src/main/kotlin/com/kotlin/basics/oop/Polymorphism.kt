package com.kotlin.basics.oop

open class LivingCreature(
    private val name: String,
    private val category: String
) {
    open fun walk() {
        println("I have the ability to walk.")
    }

    open fun eat() {
        println("I need food to survive.")
    }

    open fun sleep() {
        println("I require rest to function properly.")
    }

    open fun introduce() {
        println("Hello! My name is $name, and I belong to the $category category.")
    }
}

private class HumanBeing(name: String) : LivingCreature(name = name, category = "Human") {

    override fun walk() {
        super.walk()
        println("However, I walk using only two legs.")
    }

    override fun eat() {
        super.eat()
        println("My diet primarily consists of vegetarian food.")
    }

    override fun sleep() {
        super.sleep()
        println("I typically need at least 7 hours of sleep.")
    }

    fun sing() {
        println("I have the ability to sing songs.")
    }

    fun speak() {
        println("I can communicate through speech.")
    }
}

private class Tiger(name: String) : LivingCreature(name = name, category = "Wild Animal (Tiger)") {

    override fun walk() {
        super.walk()
        println("I walk stealthily and swiftly.")
    }

    override fun eat() {
        super.eat()
        println("I am a carnivore and hunt for my food.")
    }

    override fun sleep() {
        super.sleep()
        println("I usually sleep during the day and hunt at night.")
    }

    fun roar() {
        println("I can roar loudly to mark my territory.")
    }
}

fun main() {
    val rahul = HumanBeing(name = "Rahul")
    rahul.introduce()
    rahul.walk()
    rahul.eat()
    rahul.sleep()
    rahul.sing()
    rahul.speak()
    println()

    val sherKhan = Tiger(name = "Sher Khan")
    sherKhan.introduce()
    sherKhan.walk()
    sherKhan.eat()
    sherKhan.sleep()
    sherKhan.roar()
}