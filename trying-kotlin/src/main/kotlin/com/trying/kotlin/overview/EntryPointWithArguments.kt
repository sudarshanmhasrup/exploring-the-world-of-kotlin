package com.trying.kotlin.overview

// The main function with arguments
fun main(arguments: Array<String>) {
    if (arguments.isEmpty()) {
        println(message = "No arguments were provided for the main function.")
    } else {
        val formattedArguments = arguments.joinToString(separator = ", ")
        println(message = "The arguments provided to the main function are: $formattedArguments.")
    }
}