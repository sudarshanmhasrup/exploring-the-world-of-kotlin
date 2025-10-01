/*
    Program: Create a function that takes a number as an argument, increments the number by +1 and returns the result.
    Modified: True.
    Source: https://edabit.com/challenge/NAQhEoxbofPidLxm9.
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
        placeholder = "Enter a number",
        errorMessage = "Invalid input! Please enter an integer value."
    ) as Int
}

private fun displayOutput(number: Int) {
    val result = increaseNumberByOne(number = number)
    println(message = "$number incremented by 1 is $result.")
}

@VisibleForTesting
internal fun increaseNumberByOne(number: Int): Int {
    return number + 1
}