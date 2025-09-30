/*
    Program: Create a function that takes two numbers as arguments and returns their sum.
    Modified: True.
    Source: https://edabit.com/challenge/3LpBLgNRyaHMvNb4j.
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
    val result = addition(firstNumber = firstNumber, secondNumber = secondNumber)
    println("The sum of $firstNumber and $secondNumber is $result.")
}

@VisibleForTesting
internal fun addition(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}