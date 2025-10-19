/*
    Program: Write a function that takes the base and height of a triangle and return its area.
    Modified: True.
    Source: https://edabit.com/challenge/3CaszbdZYGN4otQD8.
 */

package com.practice.solutions

import com.practice.solutions.model.InputType
import com.practice.solutions.util.UserInputManager
import org.jetbrains.annotations.VisibleForTesting

fun main() {
    getUserInputs(
        onUserInputsReceived = { base, height ->
            displayOutput(base = base, height = height)
        }
    )
}

private fun getUserInputs(onUserInputsReceived: (Int, Int) -> Unit) {
    val base = UserInputManager.getUserInput(
        inputType = InputType.Integer,
        placeholder = "Enter the base of the triangle",
        errorMessage = "Invalid input! Please enter an integer value."
    ) as Int
    val height = UserInputManager.getUserInput(
        inputType = InputType.Integer,
        placeholder = "Enter the height of the triangle",
        errorMessage = "Invalid input! Please enter an integer value."
    ) as Int

    onUserInputsReceived(base, height)
}

private fun displayOutput(base: Int, height: Int) {
    val result = areaOfTriangle(base = base, height = height)
    println(message = "The area of the triangle with base $base and height $height is $result.")
}

@VisibleForTesting
internal fun areaOfTriangle(base: Int, height: Int): Int {
    return (base * height) / 2
}