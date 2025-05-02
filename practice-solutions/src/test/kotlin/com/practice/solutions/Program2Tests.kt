package com.practice.solutions

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Program2Tests {

    @Test
    fun `should return zero seconds when given zero minutes`() {
        val minutes = 0
        val expectedResult = 0
        val actualResult = minutesToSeconds(minutes = minutes)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return sixty seconds when given one minute`() {
        val minutes = 1
        val expectedResult = 60
        val actualResult = minutesToSeconds(minutes = minutes)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return negative seconds when given negative minutes`() {
        val minutes = -1
        val expectedResult = -60
        val actualResult = minutesToSeconds(minutes = minutes)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return correct seconds when given large minute value`() {
        val minutes = 1_000_000
        val expectedResult = minutes * 60
        val actualResult = minutesToSeconds(minutes = minutes)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return correct seconds when given Int MAX value`() {
        val minutes = Int.MAX_VALUE
        val expectedResult = minutes * 60
        val actualResult = minutesToSeconds(minutes = minutes)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return correct seconds when given Int MIN value`() {
        val minutes = Int.MIN_VALUE
        val expectedResult = 0
        val actualResult = minutesToSeconds(minutes = minutes)
        assertEquals(expected = expectedResult, actual = actualResult)
    }
}