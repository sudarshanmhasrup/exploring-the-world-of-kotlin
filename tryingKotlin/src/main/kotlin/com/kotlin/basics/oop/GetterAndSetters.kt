package com.kotlin.basics.oop

private class GetterAndSetters {

    var audioVolume = 0
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    fun displayAudioVolume() {
        println("The audio volume is set to $audioVolume.")
    }
}

fun main() {
    val getterAndSetters = GetterAndSetters()

    // Increasing volume by 1
    getterAndSetters.audioVolume++
    getterAndSetters.displayAudioVolume()

    // Set volume to 100
    getterAndSetters.audioVolume = 100
    getterAndSetters.displayAudioVolume()

    // Increasing volume by 1
    getterAndSetters.audioVolume++
    getterAndSetters.displayAudioVolume() // Prints 100 because audio volume cannot exceed after 100
}