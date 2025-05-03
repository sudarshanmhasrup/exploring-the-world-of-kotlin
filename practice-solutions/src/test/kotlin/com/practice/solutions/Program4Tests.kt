package com.practice.solutions

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class Program4Tests {

    @Test
    fun `should return 0 when base and height are 0`() {
        val base = 0.0
        val height = 0.0
        val expectedResult = 0.0
        val actualResult = areaOfTriangle(base, height)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return correct area when base is 10 and height is 5`() {
        val base = 10.0
        val height = 5.0
        val expectedResult = 25.0
        val actualResult = areaOfTriangle(base, height)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return correct area when base is 3 and height is 4`() {
        val base = 3.0
        val height = 4.0
        val expectedResult = 6.0
        val actualResult = areaOfTriangle(base, height)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return correct area for decimal values`() {
        val base = 2.5
        val height = 4.2
        val expectedResult = (base * height) / 2
        val actualResult = areaOfTriangle(base, height)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return 0 when base is 0`() {
        val base = 0.0
        val height = 7.0
        val expectedResult = 0.0
        val actualResult = areaOfTriangle(base, height)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return 0 when height is 0`() {
        val base = 5.0
        val height = 0.0
        val expectedResult = 0.0
        val actualResult = areaOfTriangle(base, height)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should throw exception when base is negative`() {
        val base = -3.0
        val height = 4.0
        assertFailsWith<IllegalArgumentException> {
            areaOfTriangle(base, height)
        }
    }

    @Test
    fun `should throw exception when height is negative`() {
        val base = 5.0
        val height = -2.0
        assertFailsWith<IllegalArgumentException> {
            areaOfTriangle(base, height)
        }
    }

    @Test
    fun `should throw exception when both base and height are negative`() {
        val base = -5.0
        val height = -4.0
        assertFailsWith<IllegalArgumentException> {
            areaOfTriangle(base, height)
        }
    }

    @Test
    fun `should handle large values correctly`() {
        val base = 1_000_000.0
        val height = 2_000_000.0
        val expectedResult = (base * height) / 2
        val actualResult = areaOfTriangle(base, height)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should handle Double MAX_VALUE without throwing`() {
        val base = Double.MAX_VALUE
        val height = Double.MAX_VALUE
        val expectedResult = Double.POSITIVE_INFINITY
        val actualResult = areaOfTriangle(base, height)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return NaN if base is NaN`() {
        val base = Double.NaN
        val height = 5.0
        val actualResult = areaOfTriangle(base, height)
        assertEquals(expected = true, actual = actualResult.isNaN())
    }

    @Test
    fun `should return NaN if height is NaN`() {
        val base = 5.0
        val height = Double.NaN
        val actualResult = areaOfTriangle(base, height)
        assertEquals(expected = true, actual = actualResult.isNaN())
    }

    @Test
    fun `should return NaN if both base and height are NaN`() {
        val base = Double.NaN
        val height = Double.NaN
        val actualResult = areaOfTriangle(base, height)
        assertEquals(expected = true, actual = actualResult.isNaN())
    }

    @Test
    fun `should return Infinity if base is Infinity`() {
        val base = Double.POSITIVE_INFINITY
        val height = 2.0
        val actualResult = areaOfTriangle(base, height)
        assertEquals(expected = true, actual = actualResult.isInfinite())
    }

    @Test
    fun `should return Infinity if height is Infinity`() {
        val base = 2.0
        val height = Double.POSITIVE_INFINITY
        val actualResult = areaOfTriangle(base, height)
        assertEquals(expected = true, actual = actualResult.isInfinite())
    }

    @Test
    fun `should return Infinity if both base and height are Infinity`() {
        val base = Double.POSITIVE_INFINITY
        val height = Double.POSITIVE_INFINITY
        val actualResult = areaOfTriangle(base, height)
        assertEquals(expected = true, actual = actualResult.isInfinite())
    }
}