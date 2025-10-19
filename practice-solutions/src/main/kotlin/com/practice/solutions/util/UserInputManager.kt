package com.practice.solutions.util

import com.practice.solutions.model.InputType

internal object UserInputManager {
    fun getUserInput(
        inputType: InputType,
        placeholder: String,
        errorMessage: String? = null
    ): Any {
        var result: Any
        do {
            print(message = "$placeholder: ")
            val userInput = readln()

            val finalOutput = when (inputType) {
                InputType.String -> userInput
                InputType.Integer -> {
                    userInput.toIntOrNull()
                }
            }

            if (finalOutput != null) {
                result = finalOutput
                break
            } else {
                println(message = errorMessage)
                continue
            }
        } while (true)

        return result
    }
}