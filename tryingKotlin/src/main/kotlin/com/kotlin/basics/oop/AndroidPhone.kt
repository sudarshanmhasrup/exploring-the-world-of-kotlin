package com.kotlin.basics.oop

private class AndroidPhone(
    val deviceName: String = "Android Phone"
){
    fun powerOn() {
        println("$deviceName has been turned on.")
    }

    fun powerOff() {
        println("$deviceName has been turned off.")
    }
}

fun main() {
    val androidPhone = AndroidPhone(deviceName = "Sudarshan's A23")
    println("Your device name is: ${androidPhone.deviceName}.")
    androidPhone.powerOn()
    androidPhone.powerOff()
}