package com.practice.solutions

import kotlin.test.Test
import kotlin.test.assertEquals

class Program3Tests {

    @Test
    fun `should return 1 when given 0`() {
        val input = 0
        val expectedResult = 1
        val actualResult = incrementNumberByOne(number = input)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return 6 when given 5`() {
        val input = 5
        val expectedResult = 6
        val actualResult = incrementNumberByOne(number = input)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return -4 when given -5`() {
        val input = -5
        val expectedResult = -4
        val actualResult = incrementNumberByOne(number = input)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return Int_MAX when given Int_MAX minus 1`() {
        val input = Int.MAX_VALUE - 1
        val expectedResult = Int.MAX_VALUE
        val actualResult = incrementNumberByOne(number = input)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should overflow when given Int_MAX`() {
        val input = Int.MAX_VALUE
        val expectedResult = Int.MIN_VALUE // Integer overflow in Kotlin
        val actualResult = incrementNumberByOne(number = input)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return Int_MIN plus 1 when given Int_MIN`() {
        val input = Int.MIN_VALUE
        val expectedResult = Int.MIN_VALUE + 1
        val actualResult = incrementNumberByOne(number = input)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return -1 when given -2`() {
        val input = -2
        val expectedResult = -1
        val actualResult = incrementNumberByOne(number = input)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return 2 when given 1`() {
        val input = 1
        val expectedResult = 2
        val actualResult = incrementNumberByOne(number = input)
        assertEquals(expected = expectedResult, actual = actualResult)
    }
}