package com.practice.solutions

import kotlin.test.Test
import kotlin.test.assertEquals

class Program8Tests {
    @Test
    fun testConvertHoursToSecondsWithPositiveNumber() {
        val hours = 1
        val expectedResult = 3600
        val actualResult = convertHoursToSeconds(hours = hours)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testConvertHoursToSecondsWithZero() {
        val hours = 0
        val expectedResult = 0
        val actualResult = convertHoursToSeconds(hours = hours)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testConvertHoursToSecondsWithMultipleHours() {
        val hours = 5
        val expectedResult = 18000
        val actualResult = convertHoursToSeconds(hours = hours)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testConvertHoursToSecondsWithLargeNumber() {
        val hours = 24
        val expectedResult = 86400
        val actualResult = convertHoursToSeconds(hours = hours)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testConvertHoursToSecondsWithOddNumber() {
        val hours = 7
        val expectedResult = 25200
        val actualResult = convertHoursToSeconds(hours = hours)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testConvertHoursToSecondsWithNegativeNumber() {
        val hours = -2
        val expectedResult = -7200
        val actualResult = convertHoursToSeconds(hours = hours)
        assertEquals(expected = expectedResult, actual = actualResult)
    }
}