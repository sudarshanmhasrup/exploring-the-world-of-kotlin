package com.practice.solutions

import kotlin.test.Test
import kotlin.test.assertEquals

class Program4Tests {
    @Test
    fun testAreaOfTriangleWithPositiveNumbers() {
        val base = 10
        val height = 5
        val expectedResult = 25
        val actualResult = areaOfTriangle(base = base, height = height)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testAreaOfTriangleWithZeroBase() {
        val base = 0
        val height = 5
        val expectedResult = 0
        val actualResult = areaOfTriangle(base = base, height = height)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testAreaOfTriangleWithZeroHeight() {
        val base = 10
        val height = 0
        val expectedResult = 0
        val actualResult = areaOfTriangle(base = base, height = height)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testAreaOfTriangleWithBothZero() {
        val base = 0
        val height = 0
        val expectedResult = 0
        val actualResult = areaOfTriangle(base = base, height = height)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testAreaOfTriangleWithOddNumbers() {
        val base = 7
        val height = 3

        val expectedResult = 10
        val actualResult = areaOfTriangle(base = base, height = height)

        assertEquals(expected = expectedResult, actual = actualResult)
    }
}