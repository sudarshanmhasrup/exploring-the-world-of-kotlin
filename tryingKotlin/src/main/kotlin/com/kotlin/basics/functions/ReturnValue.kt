package com.kotlin.basics.functions

private fun functionWithReturnType(): String {
    return "This function returns a string!"
}

fun main() {
    val functionReturnValue = functionWithReturnType()
    println(functionReturnValue)
}