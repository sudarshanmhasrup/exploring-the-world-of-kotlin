/*
    Program: Create a function that takes length and width and finds the perimeter of a rectangle.
    Modified: True.
    Source: https://edabit.com/challenge/XnJ24rWW7iJkNrtsh.
 */

package com.practice.solutions

import com.practice.solutions.model.InputType
import com.practice.solutions.util.UserInputManager
import org.jetbrains.annotations.VisibleForTesting

fun main() {
    getUserInputs(
        onUserInputReceived = { length, width ->
            displayOutput(length = length, width = width)
        }
    )
}

private fun getUserInputs(onUserInputReceived: (Int, Int) -> Unit) {
    val length = UserInputManager.getUserInput(
        inputType = InputType.Integer,
        placeholder = "Please enter the length of the rectangle",
        errorMessage = "Invalid input! Please enter an integer value."
    ) as Int
    val width = UserInputManager.getUserInput(
        inputType = InputType.Integer,
        placeholder = "Please enter the width of the rectangle",
        errorMessage = "Invalid input! Please enter an integer value."
    ) as Int

    onUserInputReceived(length, width)
}

private fun displayOutput(length: Int, width: Int) {
    val result = calculatePerimeterOfRectangle(length = length, width = width)
    println(message = "The perimeter of a rectangle with length $length and width $width is $result.")
}

@VisibleForTesting
internal fun calculatePerimeterOfRectangle(length: Int, width: Int): Int {
    return 2 * (length + width)
}