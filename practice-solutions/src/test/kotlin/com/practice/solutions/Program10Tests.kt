package com.practice.solutions

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class Program10Tests {

    @Test
    fun `should return correct remainder for positive numbers`() {
        val first = 10
        val second = 3
        val expectedResult = 1
        val actualResult = getReminder(firstNumber = first, secondNumber = second)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return zero when first number is divisible by second`() {
        val first = 20
        val second = 5
        val expectedResult = 0
        val actualResult = getReminder(firstNumber = first, secondNumber = second)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return first number when second number is greater than first`() {
        val first = 3
        val second = 10
        val expectedResult = 3
        val actualResult = getReminder(firstNumber = first, secondNumber = second)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return negative remainder if first number is negative`() {
        val first = -10
        val second = 3
        val expectedResult = -1
        val actualResult = getReminder(firstNumber = first, secondNumber = second)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return positive remainder if second number is negative`() {
        val first = 10
        val second = -3
        val expectedResult = 1
        val actualResult = getReminder(firstNumber = first, secondNumber = second)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return negative remainder if both numbers are negative`() {
        val first = -10
        val second = -3
        val expectedResult = -1
        val actualResult = getReminder(firstNumber = first, secondNumber = second)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return zero when first number is zero`() {
        val first = 0
        val second = 7
        val expectedResult = 0
        val actualResult = getReminder(firstNumber = first, secondNumber = second)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should throw ArithmeticException when second number is zero`() {
        val first = 10
        val second = 0
        assertFailsWith<ArithmeticException> {
            getReminder(firstNumber = first, secondNumber = second)
        }
    }
}