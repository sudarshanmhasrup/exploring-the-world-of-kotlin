/*
    Program: Create a function that takes voltage and current and returns the calculated power.
    Modified: True.
    Source: https://edabit.com/challenge/wAdE9te55cowBLcPs.
 */

package com.practice.solutions

import com.practice.solutions.model.InputType
import com.practice.solutions.util.UserInputManager
import org.jetbrains.annotations.VisibleForTesting

fun main() {
    getUserInputs(
        onUserInputReceived = { voltage, current ->
            displayOutput(voltage = voltage, current = current)
        }
    )
}

private fun getUserInputs(onUserInputReceived: (Int, Int) -> Unit) {
    val voltage = UserInputManager.getUserInput(
        inputType = InputType.Integer,
        placeholder = "Please enter the voltage",
        errorMessage = "Invalid input! Please enter an integer value."
    ) as Int
    val current = UserInputManager.getUserInput(
        inputType = InputType.Integer,
        placeholder = "Please enter the current",
        errorMessage = "Invalid input! Please enter an integer value."
    ) as Int

    onUserInputReceived(voltage, current)
}

private fun displayOutput(voltage: Int, current: Int) {
    val result = calculatePower(voltage = voltage, current = current)
    println(message = "The power for $voltage V and $current A is $result W.")
}

@VisibleForTesting
internal fun calculatePower(voltage: Int, current: Int): Int {
    return voltage * current
}