package com.practice.solutions

import kotlin.test.Test
import kotlin.test.assertEquals

class Program14Tests {
    @Test
    fun testCalculatePolygonAnglesWithTriangle() {
        val sides = 3
        val expectedResult = 180
        val actualResult = calculatePolygonAngles(sides = sides)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testCalculatePolygonAnglesWithSquare() {
        val sides = 4
        val expectedResult = 360
        val actualResult = calculatePolygonAngles(sides = sides)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testCalculatePolygonAnglesWithPentagon() {
        val sides = 5
        val expectedResult = 540
        val actualResult = calculatePolygonAngles(sides = sides)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testCalculatePolygonAnglesWithLargePolygon() {
        val sides = 1000
        val expectedResult = (1000 - 2) * 180
        val actualResult = calculatePolygonAngles(sides = sides)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testCalculatePolygonAnglesWithMinimumValidPolygon() {
        val sides = 3
        val expectedResult = 180
        val actualResult = calculatePolygonAngles(sides = sides)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testCalculatePolygonAnglesWithInvalidSidesZero() {
        val sides = 0
        val expectedResult = -360
        val actualResult = calculatePolygonAngles(sides = sides)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testCalculatePolygonAnglesWithInvalidSidesNegative() {
        val sides = -5
        val expectedResult = -1260
        val actualResult = calculatePolygonAngles(sides = sides)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testCalculatePolygonAnglesWithIntMaxValue() {
        val sides = Int.MAX_VALUE
        val expectedResult = (Int.MAX_VALUE - 2) * 180
        val actualResult = calculatePolygonAngles(sides = sides)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testCalculatePolygonAnglesWithIntMinValue() {
        val sides = Int.MIN_VALUE
        val expectedResult = (Int.MIN_VALUE - 2) * 180
        val actualResult = calculatePolygonAngles(sides = sides)
        assertEquals(expected = expectedResult, actual = actualResult)
    }
}
