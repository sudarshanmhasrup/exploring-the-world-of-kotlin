package com.practice.solutions

import com.practice.solutions.common.INVALID_INTEGER_INPUT_ERROR
import com.practice.solutions.util.UserInputManager
import com.practice.solutions.util.UserInputType

/*
    Problem statement: Create a function which returns the reminder from two numbers.
    Modified: True.
    Source:
 */

fun main() {
    getUserInput(
        onUserInputReceived = { firstNumber, secondNumber ->
            displayOutput(firstNumber = firstNumber, secondNumber = secondNumber)
        }
    )
}

private fun getUserInput(onUserInputReceived: (Int, Int) -> Unit) {
    val firstNumber = UserInputManager.getUserInput(
        placeholder = "Enter the first number",
        error = INVALID_INTEGER_INPUT_ERROR,
        userInputType = UserInputType.INTEGER
    ) as Int
    val secondNumber = UserInputManager.getUserInput(
        placeholder = "Enter the second number",
        error = INVALID_INTEGER_INPUT_ERROR,
        userInputType = UserInputType.INTEGER
    ) as Int

    onUserInputReceived(firstNumber, secondNumber)
}

private fun displayOutput(firstNumber: Int, secondNumber: Int) {
    val result = getReminder(firstNumber = firstNumber, secondNumber = secondNumber)
    println("The reminder of $firstNumber divided by $secondNumber is: $result.")
}

internal fun getReminder(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber % secondNumber
}