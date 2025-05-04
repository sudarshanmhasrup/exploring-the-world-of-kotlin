package com.practice.solutions

import kotlin.test.Test
import kotlin.test.assertEquals

class Program5Tests {

    @Test
    fun `should return 0 when years is 0`() {
        val years = 0
        val expected = 0
        val actual = calculateAgeInDays(years)
        assertEquals(expected, actual)
    }

    @Test
    fun `should return correct result for positive years`() {
        val years = 5
        val expected = 1825
        val actual = calculateAgeInDays(years)
        assertEquals(expected, actual)
    }

    @Test
    fun `should return correct result for 1 year`() {
        val years = 1
        val expected = 365
        val actual = calculateAgeInDays(years)
        assertEquals(expected, actual)
    }

    @Test
    fun `should return negative result for negative years`() {
        val years = -3
        val expected = -1095
        val actual = calculateAgeInDays(years)
        assertEquals(expected, actual)
    }

    @Test
    fun `should return correct result for Int MAX_VALUE`() {
        val years = Int.MAX_VALUE
        val expected = years * 365
        val actual = calculateAgeInDays(years)
        assertEquals(expected, actual)
    }

    @Test
    fun `should return correct result for Int MIN_VALUE`() {
        val years = Int.MIN_VALUE
        val expected = years * 365
        val actual = calculateAgeInDays(years)
        assertEquals(expected, actual)
    }

    @Test
    fun `should overflow if multiplication exceeds Int limit`() {
        val years = Int.MAX_VALUE / 364 + 1
        val result = calculateAgeInDays(years)
        val isOverflow = result < 0
        assertEquals(true, isOverflow)
    }
}