package com.kotlin.basics.lambdas

private val display: (String) -> Unit = { message ->
    println(message)
}

fun main() {
    display("Hello World!")
}