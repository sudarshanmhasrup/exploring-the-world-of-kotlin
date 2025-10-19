/*
    Program: Write a function that converts hours into seconds.
    Modified: True.
    Source: https://edabit.com/challenge/6AnQqiEjkJdZrWhPS.
 */

package com.practice.solutions

import com.practice.solutions.model.InputType
import com.practice.solutions.util.UserInputManager
import org.jetbrains.annotations.VisibleForTesting

fun main() {
    val userInput = getUserInput()
    displayOutput(hours = userInput)
}

private fun getUserInput(): Int {
    return UserInputManager.getUserInput(
        inputType = InputType.Integer,
        placeholder = "Please enter hours",
        errorMessage = "Invalid input! Please enter an integer value."
    ) as Int
}

private fun displayOutput(hours: Int) {
    val result = convertHoursToSeconds(hours = hours)
    val hoursSuffix = if (hours == 1) "hour" else "hours"
    println(message = "$hours $hoursSuffix in seconds are $result seconds.")
}

@VisibleForTesting
internal fun convertHoursToSeconds(hours: Int): Int {
    return hours * 3600
}