package com.kotlin.basics.lambdas

fun main() {
    val noTreat = trickOrTreat(isTrick = true)
    val haveTreat = trickOrTreat(isTrick = false)
    noTreat()
    haveTreat()
}

private fun trickOrTreat(isTrick: Boolean): () -> Unit {
    return if (isTrick) trick else treat
}

private val trick = {
    println("No treats!")
}

private val treat = {
    println("Have a treat!")
}