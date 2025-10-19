/*
    Program: Create a function that finds the maximum range of a triangle's third edge, where the side lengths are all
    integers.
    Modified: True.
    Source: https://edabit.com/challenge/nhXofMMyrowMyr9Nv.
 */

package com.practice.solutions

import com.practice.solutions.model.InputType
import com.practice.solutions.util.UserInputManager
import org.jetbrains.annotations.VisibleForTesting

fun main() {
    getUserInputs(
        onUserInputsReceived = { side1, side2 ->
            displayOutput(side1 = side1, side2 = side2)
        }
    )
}

private fun getUserInputs(onUserInputsReceived: (Int, Int) -> Unit) {
    val side1 = UserInputManager.getUserInput(
        inputType = InputType.Integer,
        placeholder = "Enter the length of the first side of the triangle",
        errorMessage = "Invalid input! Please enter an integer value."
    ) as Int
    val side2 = UserInputManager.getUserInput(
        inputType = InputType.Integer,
        placeholder = "Enter the length of the second side of the triangle",
        errorMessage = "Invalid input! Please enter an integer value."
    ) as Int

    onUserInputsReceived(side1, side2)
}

private fun displayOutput(side1: Int, side2: Int) {
    val result = findMaximumEdgeOfATriangle(side1 = side1, side2 = side2)
    println(message = "The maximum possible length of the third side of a triangle with $side1 and $side2 is $result.")
}

@VisibleForTesting
internal fun findMaximumEdgeOfATriangle(side1: Int, side2: Int): Int {
    return (side1 + side2) - 1
}