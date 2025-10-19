/*
    Program: You are counting points for a basketball game, given the amount of 2-pointers scored and 3-pointers scored,
    find the final points for the team and return that value.
    Modified: True.
    Source: https://edabit.com/challenge/Y46Xp2pcvTB77bmdD.
 */

package com.practice.solutions

import com.practice.solutions.model.InputType
import com.practice.solutions.util.UserInputManager
import org.jetbrains.annotations.VisibleForTesting

fun main() {
    getUserInputs { twoPointers, threePointers ->
        displayOutput(twoPointers = twoPointers, threePointers = threePointers)
    }
}

private fun getUserInputs(onUserInputsReceived: (Int, Int) -> Unit) {
    val twoPointers = UserInputManager.getUserInput(
        inputType = InputType.Integer,
        placeholder = "Enter number of 2-pointers",
        errorMessage = "Invalid input! Please enter an integer value."
    ) as Int
    val threePointers = UserInputManager.getUserInput(
        inputType = InputType.Integer,
        placeholder = "Enter number of 3-pointers",
        errorMessage = "Invalid input! Please enter an integer value."
    ) as Int

    onUserInputsReceived(twoPointers, threePointers)
}

private fun displayOutput(twoPointers: Int, threePointers: Int) {
    val result = calculateBasketballPoints(twoPointers = twoPointers, threePointers = threePointers)
    println(
        message = "The total points scored with $twoPointers two-pointers and $threePointers three-pointers is $result."
    )
}

@VisibleForTesting
internal fun calculateBasketballPoints(twoPointers: Int, threePointers: Int): Int {
    return (twoPointers * 2) + (threePointers * 3)
}