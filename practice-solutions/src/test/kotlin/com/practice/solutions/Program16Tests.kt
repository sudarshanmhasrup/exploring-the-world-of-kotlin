package com.practice.solutions

import kotlin.test.Test
import kotlin.test.assertEquals

class Program16Tests {
    @Test
    fun testIsSumLessThan100WithSumLessThan100() {
        val firstNumber = 40
        val secondNumber = 50
        val expectedResult = true
        val actualResult = isSumLessThan100(firstNumber = firstNumber, secondNumber = secondNumber)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testIsSumLessThan100WithSumEqualTo100() {
        val firstNumber = 50
        val secondNumber = 50
        val expectedResult = false
        val actualResult = isSumLessThan100(firstNumber = firstNumber, secondNumber = secondNumber)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testIsSumLessThan100WithSumGreaterThan100() {
        val firstNumber = 60
        val secondNumber = 50
        val expectedResult = false
        val actualResult = isSumLessThan100(firstNumber = firstNumber, secondNumber = secondNumber)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testIsSumLessThan100WithNegativeNumbers() {
        val firstNumber = -10
        val secondNumber = 20
        val expectedResult = true
        val actualResult = isSumLessThan100(firstNumber = firstNumber, secondNumber = secondNumber)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testIsSumLessThan100WithBothNegativeNumbers() {
        val firstNumber = -50
        val secondNumber = -30
        val expectedResult = true
        val actualResult = isSumLessThan100(firstNumber = firstNumber, secondNumber = secondNumber)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testIsSumLessThan100WithZeroNumbers() {
        val firstNumber = 0
        val secondNumber = 0
        val expectedResult = true
        val actualResult = isSumLessThan100(firstNumber = firstNumber, secondNumber = secondNumber)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testIsSumLessThan100WithIntMaxValues() {
        val firstNumber = Int.MAX_VALUE
        val secondNumber = 0
        val expectedResult = false
        val actualResult = isSumLessThan100(firstNumber = firstNumber, secondNumber = secondNumber)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testIsSumLessThan100WithIntMinValues() {
        val firstNumber = Int.MIN_VALUE
        val secondNumber = 0
        val expectedResult = true
        val actualResult = isSumLessThan100(firstNumber = firstNumber, secondNumber = secondNumber)
        assertEquals(expected = expectedResult, actual = actualResult)
    }
}
