/*
    Program: Write a function that takes an integer minute and converts it to seconds.
    Modified: True.
    Source: https://edabit.com/challenge/8q54MKnRrm89pSLmW.
 */

package com.practice.solutions

import com.practice.solutions.model.InputType
import com.practice.solutions.util.UserInputManager
import org.jetbrains.annotations.VisibleForTesting

fun main() {
    val minutes = getUserInput()
    displayOutput(minutes = minutes)
}

private fun getUserInput(): Int {
    return UserInputManager.getUserInput(
        placeholder = "Enter minutes in number",
        errorMessage = "Invalid input! Please enter an integer value.",
        inputType = InputType.Integer
    ) as Int
}

private fun displayOutput(minutes: Int) {
    val minutesMessageSuffix = if (minutes == 1) "minute" else "minutes"
    val verb = if (minutes == 1) "is" else "are"
    val result = convertMinutesToSeconds(minutes = minutes)

    println(message = "$minutes $minutesMessageSuffix in seconds $verb $result seconds.")
}

@VisibleForTesting
internal fun convertMinutesToSeconds(minutes: Int): Int {
    return minutes * 60
}