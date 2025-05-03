package com.practice.solutions

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Program1Tests {

    @Test
    fun `should return correct sum when adding two positive numbers`() {
        val firstNumber = 20
        val secondNumber = 40
        val expectedResult = 60
        val actualResult = addition(firstNumber = firstNumber, secondNumber = secondNumber)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return zero when adding two zeros`() {
        val firstNumber = 0
        val secondNumber = 0
        val expectedResult = 0
        val actualResult = addition(firstNumber = firstNumber, secondNumber = secondNumber)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return correct sum when adding positive and negative number`() {
        val firstNumber = 20
        val secondNumber = -10
        val expectedResult = 10
        val actualResult = addition(firstNumber = firstNumber, secondNumber = secondNumber)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return correct sum when adding two negative numbers`() {
        val firstNumber = -5
        val secondNumber = -10
        val expectedResult = -15
        val actualResult = addition(firstNumber = firstNumber, secondNumber = secondNumber)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return correct sum when adding zero and a positive number`() {
        val firstNumber = 0
        val secondNumber = 25
        val expectedResult = 25
        val actualResult = addition(firstNumber = firstNumber, secondNumber = secondNumber)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return correct sum when adding a positive number and zero`() {
        val firstNumber = 15
        val secondNumber = 0
        val expectedResult = 15
        val actualResult = addition(firstNumber = firstNumber, secondNumber = secondNumber)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return correct sum when adding max and min integer values`() {
        val firstNumber = Int.MAX_VALUE
        val secondNumber = Int.MIN_VALUE
        val expectedResult = Int.MAX_VALUE + Int.MIN_VALUE
        val actualResult = addition(firstNumber = firstNumber, secondNumber = secondNumber)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should overflow when adding max integer and one`() {
        val firstNumber = Int.MAX_VALUE
        val secondNumber = 1
        val expectedResult = Int.MIN_VALUE // due to overflow
        val actualResult = addition(firstNumber = firstNumber, secondNumber = secondNumber)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should underflow when adding min integer and negative one`() {
        val firstNumber = Int.MIN_VALUE
        val secondNumber = -1
        val expectedResult = Int.MAX_VALUE // due to underflow
        val actualResult = addition(firstNumber = firstNumber, secondNumber = secondNumber)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return double the value when adding a number to itself`() {
        val firstNumber = 123
        val secondNumber = 123
        val expectedResult = 246
        val actualResult = addition(firstNumber = firstNumber, secondNumber = secondNumber)
        assertEquals(expected = expectedResult, actual = actualResult)
    }

    @Test
    fun `should return same result when parameters are swapped`() {
        val firstNumber = 10
        val secondNumber = -20
        val result1 = addition(firstNumber = firstNumber, secondNumber = secondNumber)
        val result2 = addition(firstNumber = secondNumber, secondNumber = firstNumber)
        assertEquals(expected = result1, actual = result2)
    }
}