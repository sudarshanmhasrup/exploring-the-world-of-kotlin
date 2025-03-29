package com.kotlin.basics.lambdas

private fun printToConsole(messageToPrint: () -> String) {
    println(messageToPrint())
}

fun main() {
    printToConsole { "Hello World!" }
}