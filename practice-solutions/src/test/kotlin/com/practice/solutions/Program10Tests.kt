package com.practice.solutions

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class Program10Tests {
    @Test
    fun testGetReminderWithPositiveNumbers() {
        val firstNumber = 10
        val secondNumber = 3
        val expectedResult = 1
        val actualResult = getReminder(firstNumber = firstNumber, secondNumber = secondNumber)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testGetReminderWhenFirstNumberIsSmaller() {
        val firstNumber = 3
        val secondNumber = 10
        val expectedResult = 3
        val actualResult = getReminder(firstNumber = firstNumber, secondNumber = secondNumber)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testGetReminderWithZeroDividend() {
        val firstNumber = 0
        val secondNumber = 5
        val expectedResult = 0
        val actualResult = getReminder(firstNumber = firstNumber, secondNumber = secondNumber)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testGetReminderWithNegativeDividend() {
        val firstNumber = -10
        val secondNumber = 3
        val expectedResult = -1
        val actualResult = getReminder(firstNumber = firstNumber, secondNumber = secondNumber)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testGetReminderWithNegativeDivisor() {
        val firstNumber = 10
        val secondNumber = -3
        val expectedResult = 1
        val actualResult = getReminder(firstNumber = firstNumber, secondNumber = secondNumber)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testGetReminderWithBothNegativeNumbers() {
        val firstNumber = -10
        val secondNumber = -3
        val expectedResult = -1
        val actualResult = getReminder(firstNumber = firstNumber, secondNumber = secondNumber)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testGetReminderWithIntMaxValue() {
        val firstNumber = Int.MAX_VALUE
        val secondNumber = 2
        val expectedResult = 1
        val actualResult = getReminder(firstNumber = firstNumber, secondNumber = secondNumber)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testGetReminderWithIntMinValue() {
        val firstNumber = Int.MIN_VALUE
        val secondNumber = 2
        val expectedResult = 0
        val actualResult = getReminder(firstNumber = firstNumber, secondNumber = secondNumber)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testGetReminderDivideByZeroThrowsException() {
        val firstNumber = 10
        val secondNumber = 0
        assertFailsWith<ArithmeticException> {
            getReminder(firstNumber = firstNumber, secondNumber = secondNumber)
        }
    }
}