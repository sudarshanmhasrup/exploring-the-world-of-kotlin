package com.kotlin.solutions

import com.kotlin.solutions.util.InputType
import com.kotlin.solutions.util.UserInputManager

/*
    Problem statement: Create a function that takes two numbers as arguments and returns their sum.
    Modified: True.
    Source: https://edabit.com/challenge/3LpBLgNRyaHMvNb4j
 */

fun main() {
    getUserInputs(
        onUserInputReceived = { firstNumber, lastNumber ->
            displayOutput(firstNumber = firstNumber, lastNumber = lastNumber)
        }
    )
}

private fun getUserInputs(onUserInputReceived: (Int, Int) -> Unit) {
    val firstNumber = UserInputManager.getUserInput(
        placeholder = "Enter the first number",
        error = "Invalid input! Please enter an integer.",
        inputType = InputType.INTEGER
    ) as Int

    val secondNumber = UserInputManager.getUserInput(
        placeholder = "Enter the second number",
        error = "Invalid input! Please enter an integer.",
        inputType = InputType.INTEGER
    ) as Int

    onUserInputReceived(firstNumber, secondNumber)
}

private fun displayOutput(firstNumber: Int, lastNumber: Int) {
    val addition = addition(firstNumber = firstNumber, lastNumber = lastNumber)
    println("The addition of $firstNumber and $lastNumber is $addition.")
}

private fun addition(firstNumber: Int, lastNumber: Int): Int = firstNumber + lastNumber