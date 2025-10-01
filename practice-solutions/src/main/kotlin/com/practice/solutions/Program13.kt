/*
    Program: Create a function that takes a number as its only argument and returns true if it's less than or equal to
    zero, otherwise return false.
    Modified: True.
    Source: https://edabit.com/challenge/PTiLYyb4A69KZtBCg.
 */

package com.practice.solutions

import com.practice.solutions.model.InputType
import com.practice.solutions.util.UserInputManager
import org.jetbrains.annotations.VisibleForTesting

fun main() {
    val userInput = getUserInput()
    displayOutput(number = userInput)
}

private fun getUserInput(): Int {
    return UserInputManager.getUserInput(
        inputType = InputType.Integer,
        placeholder = "Please enter a number",
        errorMessage = "Invalid input! Please enter an integer value."
    ) as Int
}

private fun displayOutput(number: Int) {
    val result = lessThanOrEqualToZero(number = number)
    val message = if (result) {
        "Your entered number is less than or equal to zero!"
    } else {
        "Your entered number is greater than zero!"
    }
    println(message = message)
}

@VisibleForTesting
internal fun lessThanOrEqualToZero(number: Int): Boolean {
    return number <= 0
}