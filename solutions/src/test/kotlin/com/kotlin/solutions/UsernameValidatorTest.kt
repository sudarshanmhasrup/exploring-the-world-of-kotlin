package com.kotlin.solutions

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class UsernameValidatorTest {

    private val usernameValidator = UsernameValidator()

    @Test
    fun `validate username too short`() {
        val usernameInput = "a"
        val expectedResult = false
        val actualResult = usernameValidator.validateUsername(usernameInput)
        assertEquals(expectedResult, actualResult, "Test failed for username: $usernameInput")
    }

    @Test
    fun `validate username too long`() {
        val usernameInput = "a".repeat(65)
        val expectedResult = false
        val actualResult = usernameValidator.validateUsername(usernameInput)
        assertEquals(expectedResult, actualResult, "Test failed for username: $usernameInput")
    }

    @Test
    fun `validate username with invalid characters`() {
        val usernameInput = "sudarshan@mhasrup"
        val expectedResult = false
        val actualResult = usernameValidator.validateUsername(usernameInput)
        assertEquals(expectedResult, actualResult, "Test failed for username: $usernameInput")
    }

    @Test
    fun `validate username starting with dot`() {
        val usernameInput = ".username"
        val expectedResult = false
        val actualResult = usernameValidator.validateUsername(usernameInput)
        assertEquals(expectedResult, actualResult, "Test failed for username: $usernameInput")
    }

    @Test
    fun `validate username ending with underscore`() {
        val usernameInput = "username_"
        val expectedResult = false
        val actualResult = usernameValidator.validateUsername(usernameInput)
        assertEquals(expectedResult, actualResult, "Test failed for username: $usernameInput")
    }

    @Test
    fun `validate username with consecutive dots`() {
        val usernameInput = "user..name"
        val expectedResult = false
        val actualResult = usernameValidator.validateUsername(usernameInput)
        assertEquals(expectedResult, actualResult, "Test failed for username: $usernameInput")
    }

    @Test
    fun `validate username with valid format`() {
        val usernameInput = "sudarshan.mhasrup"
        val expectedResult = true
        val actualResult = usernameValidator.validateUsername(usernameInput)
        assertEquals(expectedResult, actualResult, "Test failed for username: $usernameInput")
    }

    @Test
    fun `validate username with numbers`() {
        val usernameInput = "user123"
        val expectedResult = true
        val actualResult = usernameValidator.validateUsername(usernameInput)
        assertEquals(expectedResult, actualResult, "Test failed for username: $usernameInput")
    }

    @Test
    fun `validate username with hyphen`() {
        val usernameInput = "user-name"
        val expectedResult = false
        val actualResult = usernameValidator.validateUsername(usernameInput)
        assertEquals(expectedResult, actualResult, "Test failed for username: $usernameInput")
    }

    @Test
    fun `validate username with mixed valid symbols`() {
        val usernameInput = "user_name-123"
        val expectedResult = false
        val actualResult = usernameValidator.validateUsername(usernameInput)
        assertEquals(expectedResult, actualResult, "Test failed for username: $usernameInput")
    }
}
