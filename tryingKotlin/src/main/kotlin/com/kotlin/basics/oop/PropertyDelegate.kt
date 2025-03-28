package com.kotlin.basics.oop

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class PropertyDelegate(
    initialValue: Int,
    private val minValue: Int,
    private val maxValue: Int
): ReadWriteProperty<Any?, Int> {

    private var fieldData = initialValue

    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return fieldData
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        if (value in minValue..maxValue) {
            fieldData = value
        }
    }
}

fun main() {
    var audioVolume by PropertyDelegate(initialValue = 0, minValue = 0, maxValue = 100)
    println("The audio's current volume is set to $audioVolume.")

    audioVolume++
    println("The audio's current volume is set to $audioVolume.")

    audioVolume += 100
    println("The audio's current volume is set to $audioVolume.")

    audioVolume = 100
    println("The audio's current volume is set to $audioVolume.")
}