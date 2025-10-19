package com.practice.solutions

import kotlin.test.Test
import kotlin.test.assertEquals

class Program12Tests {
    @Test
    fun testGiveMeSomethingWithNormalString() {
        val input = "test"
        val expectedResult = "something test"
        val actualResult = giveMeSomething(input = input)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testGiveMeSomethingWithEmptyString() {
        val input = ""
        val expectedResult = "something "
        val actualResult = giveMeSomething(input = input)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testGiveMeSomethingWithWhitespace() {
        val input = "   "
        val expectedResult = "something    "
        val actualResult = giveMeSomething(input = input)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testGiveMeSomethingWithSpecialCharacters() {
        val input = "!@#$%^&*()"
        val expectedResult = "something !@#$%^&*()"
        val actualResult = giveMeSomething(input = input)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun testGiveMeSomethingWithLongString() {
        val input = "a".repeat(1000)
        val expectedResult = "something ${"a".repeat(1000)}"
        val actualResult = giveMeSomething(input = input)
        assertEquals(expected = expectedResult, actual = actualResult)
    }
}
