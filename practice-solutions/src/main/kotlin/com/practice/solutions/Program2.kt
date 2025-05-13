package com.practice.solutions

import com.practice.solutions.common.INVALID_INTEGER_INPUT_ERROR
import com.practice.solutions.util.UserInputManager
import com.practice.solutions.util.UserInputType

/*
    Problem statement: Write a function that takes an integer minutes and converts it to seconds.
    Modified: True.
    Source: https://edabit.com/challenge/8q54MKnRrm89pSLmW.
 */

fun main() {
    val minutes = getUserInput()
    displayOutput(minutes = minutes)
}

private fun getUserInput(): Int {
    return UserInputManager.getUserInput(
        placeholder = "Enter minutes in digit",
        error = INVALID_INTEGER_INPUT_ERROR,
        userInputType = UserInputType.INTEGER
    ) as Int
}

private fun displayOutput(minutes: Int) {
    val result = minutesToSeconds(minutes = minutes)
    val minutesSuffix = if (minutes == 1) "minute" else "minutes"

    println("$minutes $minutesSuffix is same as $result seconds")
}

internal fun minutesToSeconds(minutes: Int): Int {
    return minutes * 60
}