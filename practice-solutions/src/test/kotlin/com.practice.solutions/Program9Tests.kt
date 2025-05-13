package com.practice.solutions

import kotlin.test.Test
import kotlin.test.assertEquals

class Program9Tests {

    @Test
    fun `should return correct third edge when both sides are positive`() {
        val side1 = 7
        val side2 = 10
        val expectedResult = 16
        val actualResult = getThirdEdgeOfTriangle(side1Length = side1, side2Length = side2)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return correct third edge when both sides are equal`() {
        val side1 = 5
        val side2 = 5
        val expectedResult = 9
        val actualResult = getThirdEdgeOfTriangle(side1Length = side1, side2Length = side2)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return zero when both sides are 1`() {
        val side1 = 1
        val side2 = 1
        val expectedResult = 1
        val actualResult = getThirdEdgeOfTriangle(side1Length = side1, side2Length = side2)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return large third edge value for large inputs`() {
        val side1 = 1_000_000
        val side2 = 2_000_000
        val expectedResult = 2_999_999
        val actualResult = getThirdEdgeOfTriangle(side1Length = side1, side2Length = side2)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return negative result if one side is negative`() {
        val side1 = -3
        val side2 = 4
        val expectedResult = 0 // -3 + 4 - 1 = 0
        val actualResult = getThirdEdgeOfTriangle(side1Length = side1, side2Length = side2)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return negative result if both sides are negative`() {
        val side1 = -5
        val side2 = -2
        val expectedResult = -8
        val actualResult = getThirdEdgeOfTriangle(side1Length = side1, side2Length = side2)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return edge case for zero and positive side`() {
        val side1 = 0
        val side2 = 10
        val expectedResult = 9
        val actualResult = getThirdEdgeOfTriangle(side1Length = side1, side2Length = side2)
        assertEquals(expected = expectedResult, actual = actualResult)
    }
}