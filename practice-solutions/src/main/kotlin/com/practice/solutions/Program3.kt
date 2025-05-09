package com.practice.solutions

import com.practice.solutions.common.INVALID_INTEGER_INPUT_ERROR
import com.practice.solutions.util.UserInputManager
import com.practice.solutions.util.UserInputType

/*
    Problem statement: Create a function that takes a number as an argument, increments the number by 1 and returns the
    result.
    Modified: True.
    Source: https://edabit.com/challenge/NAQhEoxbofPidLxm9.
 */

fun main() {
    val number = getUserInput()
    displayOutput(number = number)
}

private fun getUserInput(): Int {
    return UserInputManager.getUserInput(
        placeholder = "Enter a number",
        error = INVALID_INTEGER_INPUT_ERROR,
        userInputType = UserInputType.INTEGER
    ) as Int
}

private fun displayOutput(number: Int) {
    val result = incrementNumberByOne(number = number)
    println("The number that comes after $number is $result.")
}

internal fun incrementNumberByOne(number: Int): Int {
    return number + 1
}