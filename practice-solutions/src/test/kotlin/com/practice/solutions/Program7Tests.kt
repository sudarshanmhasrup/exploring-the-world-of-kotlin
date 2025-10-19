package com.practice.solutions

import kotlin.test.Test
import kotlin.test.assertEquals

class Program7Tests {
    @Test
    fun testCalculatePowerWithPositiveNumbers() {
        val voltage = 230
        val current = 10
        val expectedResult = 2300
        val actualResult = calculatePower(voltage = voltage, current = current)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testCalculatePowerWithSmallNumbers() {
        val voltage = 110
        val current = 3
        val expectedResult = 330
        val actualResult = calculatePower(voltage = voltage, current = current)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testCalculatePowerWithLargeNumbers() {
        val voltage = 480
        val current = 20
        val expectedResult = 9600
        val actualResult = calculatePower(voltage = voltage, current = current)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testCalculatePowerWithZeroVoltage() {
        val voltage = 0
        val current = 15
        val expectedResult = 0
        val actualResult = calculatePower(voltage = voltage, current = current)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testCalculatePowerWithZeroCurrent() {
        val voltage = 230
        val current = 0
        val expectedResult = 0
        val actualResult = calculatePower(voltage = voltage, current = current)
        assertEquals(expected = expectedResult, actual = actualResult)
    }
}