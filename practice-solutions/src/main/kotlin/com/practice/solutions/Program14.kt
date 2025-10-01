/*
    Program: Given an n-sided regular polygon n, return the total sum of internal angles (in degrees).
    Modified: True.
    Source: https://edabit.com/challenge/fBJyQSe5Jmbm9hPAG.
 */

package com.practice.solutions

import com.practice.solutions.model.InputType
import com.practice.solutions.util.UserInputManager
import org.jetbrains.annotations.VisibleForTesting

fun main() {
    val input = getUserInput()
    displayOutput(sides = input)
}

private fun getUserInput(): Int {
    var userInput: Int
    do {
        userInput =  UserInputManager.getUserInput(
            inputType = InputType.Integer,
            placeholder = "Enter the number of sides of the polygon (greater than 2)",
            errorMessage = "Invalid input! Please enter an integer value."
        ) as Int
        println(message = "Please enter a number greater than 2.")
    } while (userInput <= 2)

    return userInput
}

private fun displayOutput(sides: Int) {
    val result = calculatePolygonAngles(sides = sides)
    println(message = "The sum of internal angles of a $sides-sided polygon is $result degrees.")
}

@VisibleForTesting
internal fun calculatePolygonAngles(sides: Int): Int {
    return (sides - 2) * 180
}