package com.practice.solutions

import kotlin.test.Test
import kotlin.test.assertEquals

class Program15Tests {
    @Test
    fun testCalculateBasketballPointsWithNormalValues() {
        val twoPointers = 5
        val threePointers = 3
        val expectedResult = (5 * 2) + (3 * 3)
        val actualResult = calculateBasketballPoints(twoPointers = twoPointers, threePointers = threePointers)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testCalculateBasketballPointsWithZeroTwoPointers() {
        val twoPointers = 0
        val threePointers = 4
        val expectedResult = 0 + (4 * 3)
        val actualResult = calculateBasketballPoints(twoPointers = twoPointers, threePointers = threePointers)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testCalculateBasketballPointsWithZeroThreePointers() {
        val twoPointers = 6
        val threePointers = 0
        val expectedResult = (6 * 2) + 0
        val actualResult = calculateBasketballPoints(twoPointers = twoPointers, threePointers = threePointers)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testCalculateBasketballPointsWithBothZero() {
        val twoPointers = 0
        val threePointers = 0
        val expectedResult = 0
        val actualResult = calculateBasketballPoints(twoPointers = twoPointers, threePointers = threePointers)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testCalculateBasketballPointsWithNegativeTwoPointers() {
        val twoPointers = -5
        val threePointers = 3
        val expectedResult = (-5 * 2) + (3 * 3)
        val actualResult = calculateBasketballPoints(twoPointers = twoPointers, threePointers = threePointers)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testCalculateBasketballPointsWithNegativeThreePointers() {
        val twoPointers = 5
        val threePointers = -3
        val expectedResult = (5 * 2) + (-3 * 3)
        val actualResult = calculateBasketballPoints(twoPointers = twoPointers, threePointers = threePointers)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testCalculateBasketballPointsWithBothNegative() {
        val twoPointers = -5
        val threePointers = -3
        val expectedResult = (-5 * 2) + (-3 * 3)
        val actualResult = calculateBasketballPoints(twoPointers = twoPointers, threePointers = threePointers)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testCalculateBasketballPointsWithIntMaxValues() {
        val twoPointers = Int.MAX_VALUE
        val threePointers = 1
        val expectedResult = (Int.MAX_VALUE * 2) + (1 * 3) // will overflow Int
        val actualResult = calculateBasketballPoints(twoPointers = twoPointers, threePointers = threePointers)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testCalculateBasketballPointsWithIntMinValues() {
        val twoPointers = Int.MIN_VALUE
        val threePointers = -1
        val expectedResult = (Int.MIN_VALUE * 2) + (-1 * 3) // will overflow Int
        val actualResult = calculateBasketballPoints(twoPointers = twoPointers, threePointers = threePointers)
        assertEquals(expected = expectedResult, actual = actualResult)
    }
}
