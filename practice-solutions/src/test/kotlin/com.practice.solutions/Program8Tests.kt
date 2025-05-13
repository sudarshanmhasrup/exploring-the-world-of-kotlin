package com.practice.solutions

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class Program8Tests {

    @Test
    fun `should return 3600 seconds for 1 hour`() {
        val hours = 1
        val expectedResult = 3600
        val actualResult = convertHoursIntoSeconds(hours = hours)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return 0 seconds for 0 hours`() {
        val hours = 0
        val expectedResult = 0
        val actualResult = convertHoursIntoSeconds(hours = hours)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return correct seconds for multiple hours`() {
        val hours = 5
        val expectedResult = 18_000
        val actualResult = convertHoursIntoSeconds(hours = hours)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return negative seconds for negative hours`() {
        val hours = -2
        val expectedResult = -7_200
        val actualResult = convertHoursIntoSeconds(hours = hours)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return max seconds without overflow for max int hours divided by 3600`() {
        val hours = Int.MAX_VALUE / 3600
        val expectedResult = hours * 3600
        val actualResult = convertHoursIntoSeconds(hours = hours)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should overflow when result exceeds max int`() {
        val hours = (Int.MAX_VALUE / 3600) + 1
        val actualResult = convertHoursIntoSeconds(hours = hours)
        println("Overflow result: $actualResult")
    }
}