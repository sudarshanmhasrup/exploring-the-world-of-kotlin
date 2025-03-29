package com.kotlin.solutions.util

object UserInputManager {

    fun getUserInput(
        placeholder: String,
        error: String = "Unexpected error occurred!",
        inputType: InputType
    ): Any {
        while(true) {
            print("$placeholder: ")
            val userInput = when (inputType) {
                InputType.INTEGER -> readln().toIntOrNull()
                InputType.STRING -> readln()
            }
            if (userInput != null) {
                return userInput
            } else {
                println(error)
            }
        }
    }
}