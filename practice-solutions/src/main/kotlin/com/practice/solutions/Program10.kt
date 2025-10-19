/*
    Program: Create a function that returns the remainder of the division of two numbers.
    Modified: True.
    Source: https://edabit.com/challenge/Q2j5FTFtsk7PdzrQk.
 */

package com.practice.solutions

import com.practice.solutions.model.InputType
import com.practice.solutions.util.UserInputManager
import org.jetbrains.annotations.VisibleForTesting

fun main() {
    getUserInputs(
        onUserInputsReceived = { firstNumber, secondNumber ->
            displayOutput(firstNumber = firstNumber, secondNumber = secondNumber)
        }
    )
}

private fun getUserInputs(onUserInputsReceived: (Int, Int) -> Unit) {
    val firstNumber = UserInputManager.getUserInput(
        inputType = InputType.Integer,
        placeholder = "Please enter the first number",
        errorMessage = "Invalid input! Please enter an integer value."
    ) as Int
    val secondNumber = UserInputManager.getUserInput(
        inputType = InputType.Integer,
        placeholder = "Please enter the second number",
        errorMessage = "Invalid input! Please enter an integer value."
    ) as Int

    onUserInputsReceived(firstNumber, secondNumber)
}

private fun displayOutput(firstNumber: Int, secondNumber: Int) {
    val result = getReminder(firstNumber = firstNumber, secondNumber = secondNumber)
    println(message = "The remainder of the division of $firstNumber by $secondNumber is $result.")
}

@VisibleForTesting
internal fun getReminder(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber % secondNumber
}