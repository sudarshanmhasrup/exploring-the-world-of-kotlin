package com.practice.solutions

import com.practice.solutions.util.UserInputManager
import com.practice.solutions.util.UserInputType

/*
    Problem statement: Write a function that takes the base and height of a triangle and return its area.
    Modified: True.
    Source: https://edabit.com/challenge/3CaszbdZYGN4otQD8.
 */

fun main() {
    getUserInput(
        onUserInputReceived = { base, height ->
            displayOutput(base = base, height = height)
        }
    )
}

private fun getUserInput(onUserInputReceived: (Double, Double) -> Unit) {
    val errorMessage = "Invalid input! Please enter a correct value."

    val base = UserInputManager.getUserInput(
        placeholder = "Enter the length of the base side of the triangle",
        error = errorMessage,
        userInputType = UserInputType.DOUBLE
    ) as Double
    val height = UserInputManager.getUserInput(
        placeholder = "Enter the length of the triangle's height",
        error = errorMessage,
        userInputType = UserInputType.DOUBLE
    ) as Double

    onUserInputReceived(base, height)
}

private fun displayOutput(base: Double, height: Double) {
    val result = areaOfTriangle(base = base, height = height)
    println("The area of triangle having base of $base and height of $height is: $result.")
}

internal fun areaOfTriangle(base: Double, height: Double): Double {
    if (base < 0 || height < 0) {
        throw IllegalArgumentException("Base and height must be non-negative.")
    }
    return (base * height) / 2
}