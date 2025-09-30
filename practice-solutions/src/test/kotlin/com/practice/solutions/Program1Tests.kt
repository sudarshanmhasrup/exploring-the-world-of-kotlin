package com.practice.solutions

import kotlin.test.Test
import kotlin.test.assertEquals

class Program1Tests {
    @Test
    fun testPositivePlusNegative() {
        val firstNumber = 5
        val secondNumber = -3
        val expectedResult = 2
        val actualResult = addition(firstNumber = firstNumber, secondNumber = secondNumber)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testNegativePlusPositive() {
        val firstNumber = -7
        val secondNumber = 4
        val expectedResult = -3
        val actualResult = addition(firstNumber = firstNumber, secondNumber = secondNumber)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testNegativePlusNegative() {
        val firstNumber = -5
        val secondNumber = -8
        val expectedResult = -13
        val actualResult = addition(firstNumber = firstNumber, secondNumber = secondNumber)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testZeroPlusZero() {
        val firstNumber = 0
        val secondNumber = 0
        val expectedResult = 0
        val actualResult = addition(firstNumber = firstNumber, secondNumber = secondNumber)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testZeroPlusPositive() {
        val firstNumber = 0
        val secondNumber = 10
        val expectedResult = 10
        val actualResult = addition(firstNumber = firstNumber, secondNumber = secondNumber)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testPositivePlusZero() {
        val firstNumber = 15
        val secondNumber = 0
        val expectedResult = 15
        val actualResult = addition(firstNumber = firstNumber, secondNumber = secondNumber)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testWithLargePositiveNumbers() {
        val firstNumber = Int.MAX_VALUE
        val secondNumber = 0
        val expectedResult = Int.MAX_VALUE
        val actualResult = addition(firstNumber = firstNumber, secondNumber = secondNumber)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testWithLargeNegativeNumbers() {
        val firstNumber = Int.MIN_VALUE
        val secondNumber = 0
        val expectedResult = Int.MIN_VALUE
        val actualResult = addition(firstNumber = firstNumber, secondNumber = secondNumber)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testOverflowCase() {
        val firstNumber = Int.MAX_VALUE
        val secondNumber = 1
        val expectedResult = Int.MIN_VALUE
        val actualResult = addition(firstNumber = firstNumber, secondNumber = secondNumber)
        assertEquals(expected = expectedResult, actual = actualResult)
    }
}