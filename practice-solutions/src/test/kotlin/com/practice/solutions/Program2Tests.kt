package com.practice.solutions

import kotlin.test.Test
import kotlin.test.assertEquals

class Program2Tests {
    @Test
    fun testOneMinute() {
        val minutes = 1
        val expectedResult = 60
        val actualResult = convertMinutesToSeconds(minutes = minutes)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testZeroMinutes() {
        val minutes = 0
        val expectedResult = 0
        val actualResult = convertMinutesToSeconds(minutes = minutes)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testMultipleMinutes() {
        val minutes = 5
        val expectedResult = 300
        val actualResult = convertMinutesToSeconds(minutes = minutes)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testNegativeMinutes() {
        val minutes = -3
        val expectedResult = -180
        val actualResult = convertMinutesToSeconds(minutes = minutes)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testLargeMinutes() {
        val minutes = Int.MAX_VALUE / 60
        val expectedResult = minutes * 60
        val actualResult = convertMinutesToSeconds(minutes = minutes)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testOverflowCase() {
        val minutes = Int.MAX_VALUE
        val expectedResult = minutes * 60
        val actualResult = convertMinutesToSeconds(minutes = minutes)
        assertEquals(expected = expectedResult, actual = actualResult)
    }
}