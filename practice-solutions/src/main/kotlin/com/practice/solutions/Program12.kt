/*
    Program: Write a function that returns the string "something" joined with a space " " and the given argument a.
    Modified: True.
    Source: https://edabit.com/challenge/MvZK536X7fyrWH8Qc.
 */

package com.practice.solutions

import com.practice.solutions.model.InputType
import com.practice.solutions.util.UserInputManager
import org.jetbrains.annotations.VisibleForTesting

fun main() {
    val userInput = getUserInput()
    displayOutput(input = userInput)
}

private fun getUserInput(): String {
    return UserInputManager.getUserInput(
        inputType = InputType.String,
        placeholder = "Please enter something",
        errorMessage = null
    ) as String
}

private fun displayOutput(input: String) {
    val result = giveMeSomething(input = input)
    println(message = result)
}

@VisibleForTesting
internal fun giveMeSomething(input: String): String {
    return "something $input"
}