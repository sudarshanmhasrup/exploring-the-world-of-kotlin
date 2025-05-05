package com.practice.solutions

import kotlin.test.Test
import kotlin.test.assertEquals

class Program7Tests {

    @Test
    fun `should return correct power when voltage and current are positive`() {
        val voltage = 10
        val current = 2
        val expectedResult = 20
        val actualResult = calculatePower(voltage = voltage, current = current)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return zero when voltage is zero`() {
        val voltage = 0
        val current = 100
        val expectedResult = 0
        val actualResult = calculatePower(voltage = voltage, current = current)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return zero when current is zero`() {
        val voltage = 220
        val current = 0
        val expectedResult = 0
        val actualResult = calculatePower(voltage = voltage, current = current)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return negative power when voltage is negative`() {
        val voltage = -10
        val current = 5
        val expectedResult = -50
        val actualResult = calculatePower(voltage = voltage, current = current)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return negative power when current is negative`() {
        val voltage = 10
        val current = -5
        val expectedResult = -50
        val actualResult = calculatePower(voltage = voltage, current = current)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return positive power when both voltage and current are negative`() {
        val voltage = -10
        val current = -5
        val expectedResult = 50
        val actualResult = calculatePower(voltage = voltage, current = current)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should handle max int values without overflow`() {
        val voltage = Int.MAX_VALUE
        val current = 1
        val expectedResult = Int.MAX_VALUE
        val actualResult = calculatePower(voltage = voltage, current = current)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should overflow when values are too large`() {
        val voltage = Int.MAX_VALUE
        val current = 2
        val actualResult = calculatePower(voltage = voltage, current = current)
        println("Overflow result: $actualResult")
    }
}