/*
    Program: Create a function that takes an array containing only numbers and return the first element.
    Modified: True.
    Source: https://edabit.com/challenge/QaApgtePE6QrCZ64o.
 */

package com.practice.solutions

import com.practice.solutions.model.InputType
import com.practice.solutions.util.UserInputManager
import org.jetbrains.annotations.VisibleForTesting

fun main() {
    val array = getUserInput()
    displayOutput(array = array)
}

private fun getUserInput(): Array<Int> {
    val arrayElements = UserInputManager.getUserInput(
        inputType = InputType.Integer,
        placeholder = "How many numbers do you want your array to have?",
        errorMessage = "Invalid input! Please enter an integer value."
    ) as Int
    val array = Array(arrayElements) { 0 }

    repeat(times = arrayElements) {
        val value = UserInputManager.getUserInput(
            inputType = InputType.Integer,
            placeholder = "Please enter the value of the element at $it index",
            errorMessage = "Invalid input! Please enter an integer value."
        ) as Int
        array[it] = value
    }

    return array
}

private fun displayOutput(array: Array<Int>) {
    val result = array.firstElementOfArray()
    println(message = "The first element of your given array is $result.")
}

@VisibleForTesting
internal fun Array<Int>.firstElementOfArray(): Int {
    return this.first()
}