package com.practice.solutions

import kotlin.test.Test
import kotlin.test.assertEquals

class Program9Tests {
    @Test
    fun testWithValidSides() {
        val side1 = 5
        val side2 = 7
        val expectedResult = (side1 + side2) - 1
        val actualResult = findMaximumEdgeOfATriangle(side1, side2)
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun testWithEqualSides() {
        val side1 = 10
        val side2 = 10
        val expectedResult = (side1 + side2) - 1
        val actualResult = findMaximumEdgeOfATriangle(side1, side2)
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun testWithZeroSides() {
        val side1 = 0
        val side2 = 0
        val expectedResult = (0) - 1
        val actualResult = findMaximumEdgeOfATriangle(side1, side2)
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun testWithNegativeSides() {
        val side1 = -5
        val side2 = -7
        val expectedResult = (side1 + side2) - 1
        val actualResult = findMaximumEdgeOfATriangle(side1, side2)
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun testWithMixedPositiveAndNegativeSides() {
        val side1 = -3
        val side2 = 7
        val expectedResult = (side1 + side2) - 1
        val actualResult = findMaximumEdgeOfATriangle(side1, side2)
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun testWithIntMaxValueAndSmallNumber() {
        val side1 = Int.MAX_VALUE
        val side2 = 1
        val expectedResult = (side1 + side2) - 1
        val actualResult = findMaximumEdgeOfATriangle(side1, side2)
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun testWithIntMinValueAndSmallNumber() {
        val side1 = Int.MIN_VALUE
        val side2 = 1
        val expectedResult = (side1 + side2) - 1
        val actualResult = findMaximumEdgeOfATriangle(side1, side2)
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun testWithBothIntMaxValues() {
        val side1 = Int.MAX_VALUE
        val side2 = Int.MAX_VALUE
        val expectedResult = (side1 + side2) - 1
        val actualResult = findMaximumEdgeOfATriangle(side1, side2)
        assertEquals(expectedResult, actualResult)
    }
}