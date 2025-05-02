package com.practice.solutions.util

object UserInputManager {

    fun getUserInput(
        placeholder: String,
        error: String,
        userInputType: UserInputType
    ): Any {
        var userInput: Any
        while (true) {
            try {
                print("$placeholder: ")
                userInput = when (userInputType) {
                    UserInputType.INTEGER -> {
                        readln().toInt()
                    }

                    UserInputType.STRING -> {
                        readln()
                    }
                }
                break
            } catch (_: Exception) {
                println(error)
            }
        }
        return userInput
    }
}