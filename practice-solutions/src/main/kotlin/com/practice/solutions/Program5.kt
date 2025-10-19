/*
    Program: Create a function that takes the age in years and returns the age in days.
    Modified: True.
    Source: https://edabit.com/challenge/bL7hSc6Zh4zZJzGmw.
 */

package com.practice.solutions

import com.practice.solutions.model.InputType
import com.practice.solutions.util.UserInputManager
import org.jetbrains.annotations.VisibleForTesting

fun main() {
    val userInput = getUserInput()
    displayOutput(age = userInput)
}

private fun getUserInput(): Int {
    return UserInputManager.getUserInput(
        inputType = InputType.Integer,
        placeholder = "Please enter your age in number",
        errorMessage = "Invalid input! Please enter an integer value."
    ) as Int
}

private fun displayOutput(age: Int) {
    val result = calculateAge(age = age)
    println(message = "Your age in days is $result days.")
}

@VisibleForTesting
internal fun calculateAge(age: Int): Int {
    return age * 365
}