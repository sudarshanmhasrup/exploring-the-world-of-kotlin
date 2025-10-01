package com.practice.solutions

import kotlin.test.Test
import kotlin.test.assertEquals

class Program5Tests {
    @Test
    fun testCalculateAgeWithPositiveNumber() {
        val age = 10
        val expectedResult = 3650
        val actualResult = calculateAge(age = age)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testCalculateAgeWithZero() {
        val age = 0
        val expectedResult = 0
        val actualResult = calculateAge(age = age)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testCalculateAgeWithOne() {
        val age = 1
        val expectedResult = 365
        val actualResult = calculateAge(age = age)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testCalculateAgeWithLargeNumber() {
        val age = 100
        val expectedResult = 36500
        val actualResult = calculateAge(age = age)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testCalculateAgeWithOddNumber() {
        val age = 7
        val expectedResult = 2555
        val actualResult = calculateAge(age = age)
        assertEquals(expected = expectedResult, actual = actualResult)
    }
}