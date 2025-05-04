package com.practice.solutions

import com.practice.solutions.util.UserInputManager
import com.practice.solutions.util.UserInputType

/*
    Problem statement: Create a function that takes an array containing only numbers and return the first element.
    Modified: True.
    Source: https://edabit.com/challenge/QaApgtePE6QrCZ64o.
 */

fun main() {
    val array = getUserInput()
    displayOutput(array = array)
}

private fun getUserInput(): Array<Int> {
    val errorMessage = "Invalid input! Please enter an integer value."
    val arraySize = UserInputManager.getUserInput(
        placeholder = "Input the total number of elements you wish to store in the array",
        error = errorMessage,
        userInputType = UserInputType.INTEGER
    ) as Int

    val array = Array(arraySize) { 0 }

    // Get array element values
    for (i in 0 until array.size) {
        array[i] = UserInputManager.getUserInput(
            placeholder = "Enter the value of element at index $i",
            error = errorMessage,
            userInputType = UserInputType.INTEGER
        ) as Int
    }

    return array
}

private fun displayOutput(array: Array<Int>) {
    val result = getFirstElementOfArray(array = array)
    println("The first element of give array is: $result.")
}

internal fun getFirstElementOfArray(array: Array<Int>): Int {
    return array[0]
}