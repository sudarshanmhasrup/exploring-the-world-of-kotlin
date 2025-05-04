package com.practice.solutions

import com.practice.solutions.util.UserInputManager
import com.practice.solutions.util.UserInputType

/*
    Problem statement: Create a function that takes the age in years and returns the age in days.
    Modified: True.
    Source: https://edabit.com/challenge/bL7hSc6Zh4zZJzGmw.
 */

fun main() {
    val years = getUserInput()
    displayOutput(years = years)
}

private fun getUserInput(): Int {
    return UserInputManager.getUserInput(
        placeholder = "Enter your age in years",
        error = "Invalid input! Please enter an integer value.",
        userInputType = UserInputType.INTEGER
    ) as Int
}

private fun displayOutput(years: Int) {
    val result = calculateAgeInDays(years = years)
    println("You are $result days old.")
}

internal fun calculateAgeInDays(years: Int): Int {
    return years * 365
}