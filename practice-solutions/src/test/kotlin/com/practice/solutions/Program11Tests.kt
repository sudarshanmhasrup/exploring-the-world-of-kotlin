package com.practice.solutions

import kotlin.test.Test
import kotlin.test.assertEquals

class Program11Tests {
    @Test
    fun testCalculatePerimeterWithPositiveNumbers() {
        val length = 10
        val width = 5
        val expectedResult = 30
        val actualResult = calculatePerimeterOfRectangle(length = length, width = width)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testCalculatePerimeterWithZeroLength() {
        val length = 0
        val width = 5
        val expectedResult = 10
        val actualResult = calculatePerimeterOfRectangle(length = length, width = width)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testCalculatePerimeterWithZeroWidth() {
        val length = 10
        val width = 0
        val expectedResult = 20
        val actualResult = calculatePerimeterOfRectangle(length = length, width = width)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testCalculatePerimeterWithBothZero() {
        val length = 0
        val width = 0
        val expectedResult = 0
        val actualResult = calculatePerimeterOfRectangle(length = length, width = width)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testCalculatePerimeterWithNegativeLength() {
        val length = -10
        val width = 5
        val expectedResult = -10
        val actualResult = calculatePerimeterOfRectangle(length = length, width = width)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testCalculatePerimeterWithNegativeWidth() {
        val length = 10
        val width = -5
        val expectedResult = 10
        val actualResult = calculatePerimeterOfRectangle(length = length, width = width)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testCalculatePerimeterWithBothNegative() {
        val length = -10
        val width = -5
        val expectedResult = -30
        val actualResult = calculatePerimeterOfRectangle(length = length, width = width)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testCalculatePerimeterWithIntMaxValue() {
        val length = Int.MAX_VALUE
        val width = 1
        val expectedResult = 0
        val actualResult = calculatePerimeterOfRectangle(length = length, width = width)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testCalculatePerimeterWithIntMinValue() {
        val length = Int.MIN_VALUE
        val width = 1
        val expectedResult = 2 * (length + width)
        val actualResult = calculatePerimeterOfRectangle(length = length, width = width)
        assertEquals(expected = expectedResult, actual = actualResult)
    }
}
