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
}