/*
    Program: Given two numbers, return true if the sum of both numbers is less than 100. Otherwise, return false.
    Modified: True.
    Source: https://edabit.com/challenge/CJZd49tCNgJkPxzFe.
 */

package com.practice.solutions

import com.practice.solutions.model.InputType
import com.practice.solutions.util.UserInputManager
import org.jetbrains.annotations.VisibleForTesting

fun main() {
    getUserInputs { firstNumber, secondNumber ->
        displayOutput(firstNumber = firstNumber, secondNumber = secondNumber)
    }
}

private fun getUserInputs(onUserInputsReceived: (Int, Int) -> Unit) {
    val firstNumber = UserInputManager.getUserInput(
        inputType = InputType.Integer,
        placeholder = "Enter number the first number",
        errorMessage = "Invalid input! Please enter an integer value."
    ) as Int
    val secondNumber = UserInputManager.getUserInput(
        inputType = InputType.Integer,
        placeholder = "Enter number the second number",
        errorMessage = "Invalid input! Please enter an integer value."
    ) as Int

    onUserInputsReceived(firstNumber, secondNumber)
}

private fun displayOutput(firstNumber: Int, secondNumber: Int) {
    val result = isSumLessThan100(firstNumber = firstNumber, secondNumber = secondNumber)
    val message = if (result) {
        "The sum of the two numbers you've entered is less than 100."
    } else {
        "The sum of the two numbers you've entered is 100 or more."
    }
    println(message = message)
}

@VisibleForTesting
internal fun isSumLessThan100(firstNumber: Int, secondNumber: Int): Boolean {
    val sumOfTwo = firstNumber + secondNumber
    return sumOfTwo < 100
}