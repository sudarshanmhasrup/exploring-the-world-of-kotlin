package com.practice.solutions

import com.practice.solutions.common.INVALID_INTEGER_INPUT_ERROR
import com.practice.solutions.util.UserInputManager
import com.practice.solutions.util.UserInputType

/*
    Problem statement: Create a function that finds the maximum range of a triangle's third edge, where the side lengths
    are all integers.
    Modified: True.
    Source: https://edabit.com/challenge/nhXofMMyrowMyr9Nv.
 */
fun main() {
    getUserInput(
        onUserInputReceived = { side1Length, side2Length ->
            displayOutput(side1Length = side1Length, side2Length = side2Length)
        }
    )
}

private fun getUserInput(onUserInputReceived: (Int, Int) -> Unit) {
    val side1Length = UserInputManager.getUserInput(
        placeholder = "Enter the length of side 1 of the triangle",
        error = INVALID_INTEGER_INPUT_ERROR,
        userInputType = UserInputType.INTEGER
    ) as Int
    val side2Length = UserInputManager.getUserInput(
        placeholder = "Enter the length of side 2 of the triangle",
        error = INVALID_INTEGER_INPUT_ERROR,
        userInputType = UserInputType.INTEGER
    ) as Int

    onUserInputReceived(side1Length, side2Length)
}

private fun displayOutput(side1Length: Int, side2Length: Int) {
    val result = getThirdEdgeOfTriangle(side1Length = side1Length, side2Length = side2Length)
    println("The maximum range of a triangle's third edge is: $result.")
}

internal fun getThirdEdgeOfTriangle(side1Length: Int, side2Length: Int): Int {
    return (side1Length + side2Length) - 1
}