package com.practice.solutions

import kotlin.test.Test
import kotlin.test.assertEquals

class Program13Tests {
    @Test
    fun testLessThanOrEqualToZeroWithPositiveNumber() {
        val number = 10
        val expectedResult = false
        val actualResult = lessThanOrEqualToZero(number = number)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testLessThanOrEqualToZeroWithZero() {
        val number = 0
        val expectedResult = true
        val actualResult = lessThanOrEqualToZero(number = number)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testLessThanOrEqualToZeroWithNegativeNumber() {
        val number = -5
        val expectedResult = true
        val actualResult = lessThanOrEqualToZero(number = number)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testLessThanOrEqualToZeroWithIntMaxValue() {
        val number = Int.MAX_VALUE
        val expectedResult = false
        val actualResult = lessThanOrEqualToZero(number = number)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testLessThanOrEqualToZeroWithIntMinValue() {
        val number = Int.MIN_VALUE
        val expectedResult = true
        val actualResult = lessThanOrEqualToZero(number = number)
        assertEquals(expected = expectedResult, actual = actualResult)
    }
}