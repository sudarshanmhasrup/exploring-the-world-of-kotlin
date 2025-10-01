package com.practice.solutions

import kotlin.test.Test
import kotlin.test.assertEquals

class Program3Tests {
    @Test
    fun testIncrementOfTen() {
        val input = 10
        val expectedResult = 11
        val actualResult = increaseNumberByOne(number = input)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testIncrementOfMinus10() {
        val input = -10
        val expectedResult = -9
        val actualResult = increaseNumberByOne(number = input)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testIncrementOfZero() {
        val input = 0
        val expectedResult = 1
        val actualResult = increaseNumberByOne(number = input)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testIncrementOfMaxInt() {
        val input = Int.MAX_VALUE
        val expectedResult = Int.MIN_VALUE
        val actualResult = increaseNumberByOne(number = input)

        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testIncrementOfMinInt() {
        val input = Int.MIN_VALUE
        val expectedResult = Int.MIN_VALUE + 1
        val actualResult = increaseNumberByOne(number = input)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testIncrementOfRandomNumber() {
        val input = 12345
        val expectedResult = 12346
        val actualResult = increaseNumberByOne(number = input)
        assertEquals(expected = expectedResult, actual = actualResult)
    }
}