package com.trying.kotlin.overview

fun main() {
    print(message = "Enter your username: ")
    val username = readln() // Read string input

    print(message = "Your username is: $username.")
}