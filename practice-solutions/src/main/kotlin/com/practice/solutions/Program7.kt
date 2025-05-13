package com.practice.solutions

import com.practice.solutions.common.INVALID_INTEGER_INPUT_ERROR
import com.practice.solutions.util.UserInputManager
import com.practice.solutions.util.UserInputType

/*
    Problem statement: Create a function that takes voltage and current and returns the calculated power.
    Modified: True.
    Source: https://edabit.com/challenge/wAdE9te55cowBLcPs.
 */

fun main() {
    getUserInput(
        onUserInputReceived = { voltage, current ->
            displayOutput(voltage = voltage, current = current)
        }
    )
}

private fun getUserInput(onUserInputReceived: (Int, Int) -> Unit) {
    val voltage = UserInputManager.getUserInput(
        placeholder = "Enter voltage",
        error = INVALID_INTEGER_INPUT_ERROR,
        userInputType = UserInputType.INTEGER
    ) as Int
    val current = UserInputManager.getUserInput(
        placeholder = "Enter current",
        error = INVALID_INTEGER_INPUT_ERROR,
        userInputType = UserInputType.INTEGER
    ) as Int

    onUserInputReceived(voltage, current)
}

private fun displayOutput(voltage: Int, current: Int) {
    val result = calculatePower(voltage = voltage, current = current)
    println("The power calculated from voltage $voltage V and current $current A is: $result W.")
}

internal fun calculatePower(voltage: Int, current: Int): Int {
    return voltage * current
}