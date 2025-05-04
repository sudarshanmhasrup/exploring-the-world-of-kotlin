package com.practice.solutions

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class Program6Tests {

    @Test
    fun `should return the only element when array has one element`() {
        val array = arrayOf(99)
        val expectedResult = 99
        val actualResult = getFirstElementOfArray(array = array)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return the first element when array has multiple elements`() {
        val array = arrayOf(10, 20, 30, 40)
        val expectedResult = 10
        val actualResult = getFirstElementOfArray(array = array)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return negative number when first element is negative`() {
        val array = arrayOf(-50, -10, 0)
        val expectedResult = -50
        val actualResult = getFirstElementOfArray(array = array)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return zero when first element is zero`() {
        val array = arrayOf(0, 1, 2)
        val expectedResult = 0
        val actualResult = getFirstElementOfArray(array = array)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should throw exception when array is empty`() {
        val array = arrayOf<Int>()
        assertFailsWith<ArrayIndexOutOfBoundsException> {
            getFirstElementOfArray(array = array)
        }
    }
}