package com.practice.solutions

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class Program6Tests {
    @Test
    fun testFirstElementOfArrayWithMultipleElements() {
        val array = arrayOf(10, 20, 30, 40)
        val expectedResult = 10
        val actualResult = array.firstElementOfArray()
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testFirstElementOfArrayWithSingleElement() {
        val array = arrayOf(99)
        val expectedResult = 99
        val actualResult = array.firstElementOfArray()
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testFirstElementOfArrayWithNegativeNumbers() {
        val array = arrayOf(-5, -10, -15)
        val expectedResult = -5
        val actualResult = array.firstElementOfArray()
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testFirstElementOfArrayWithZeros() {
        val array = arrayOf(0, 1, 2, 3)
        val expectedResult = 0
        val actualResult = array.firstElementOfArray()
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testFirstElementOfEmptyArrayThrowsException() {
        val array = emptyArray<Int>()
        assertFailsWith<NoSuchElementException> {
            array.firstElementOfArray()
        }
    }
}