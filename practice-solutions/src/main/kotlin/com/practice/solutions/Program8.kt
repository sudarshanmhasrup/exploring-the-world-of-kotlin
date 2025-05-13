package com.practice.solutions

import com.practice.solutions.common.INVALID_INTEGER_INPUT_ERROR
import com.practice.solutions.util.UserInputManager
import com.practice.solutions.util.UserInputType

/*
    Problem statement: Write a function that converts hours into seconds.
    Modified: True.
    Source: https://edabit.com/challenge/6AnQqiEjkJdZrWhPS.
 */

fun main() {
    val hours = getUserInput()
    displayOutput(hours = hours)
}

private fun getUserInput(): Int {
    return UserInputManager.getUserInput(
        placeholder = "Enter hours",
        error = INVALID_INTEGER_INPUT_ERROR,
        userInputType = UserInputType.INTEGER
    ) as Int
}

private fun displayOutput(hours: Int) {
    val result = convertHoursIntoSeconds(hours = hours)

    val hoursSuffix = if (hours == 1) "hour" else "hours"
    val sentenceVerb = if (hours == 1) "is" else "are"

    println("$hours $hoursSuffix in seconds $sentenceVerb: $result seconds.")
}

internal fun convertHoursIntoSeconds(hours: Int): Int {
    return hours * 3_600
}