package com.practice.solutions

import com.practice.solutions.common.INVALID_INTEGER_INPUT_ERROR
import com.practice.solutions.util.UserInputManager
import com.practice.solutions.util.UserInputType

/*
    Problem statement: Create a function that takes two numbers as arguments and returns their sum.
    Modified: True.
    Source: https://edabit.com/challenge/3LpBLgNRyaHMvNb4j.
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
    val result = addition(firstNumber = firstNumber, secondNumber = secondNumber)
    println("The addition of $firstNumber and $secondNumber is: $result.")
}

internal fun addition(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}