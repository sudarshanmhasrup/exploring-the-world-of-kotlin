package com.kotlin.solutions

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class EmailUsernameValidatorTest {

    private val usernameValidator = EmailUsernameValidator()

    @Test
    fun validateUsernameTest1() {
        val usernameInput = "a"
        val expectedResult = false
        val actualResult = usernameValidator.validateUsername(usernameInput)
        assertEquals(expectedResult, actualResult, "Test failed for username: $usernameInput")
    }

    @Test
    fun validateUsernameTest2() {
        val usernameInput = "a".repeat(65)
        val expectedResult = false
        val actualResult = usernameValidator.validateUsername(usernameInput)
        assertEquals(expectedResult, actualResult, "Test failed for username: $usernameInput")
    }

    @Test
    fun validateUsernameTest3() {
        val usernameInput = "sudarshan@mhasrup"
        val expectedResult = false
        val actualResult = usernameValidator.validateUsername(usernameInput)
        assertEquals(expectedResult, actualResult, "Test failed for username: $usernameInput")
    }

    @Test
    fun validateUsernameTest4() {
        val usernameInput = ".username"
        val expectedResult = false
        val actualResult = usernameValidator.validateUsername(usernameInput)
        assertEquals(expectedResult, actualResult, "Test failed for username: $usernameInput")
    }

    @Test
    fun validateUsernameTest5() {
        val usernameInput = "username_"
        val expectedResult = false
        val actualResult = usernameValidator.validateUsername(usernameInput)
        assertEquals(expectedResult, actualResult, "Test failed for username: $usernameInput")
    }

    @Test
    fun validateUsernameTest6() {
        val usernameInput = "user..name"
        val expectedResult = false
        val actualResult = usernameValidator.validateUsername(usernameInput)
        assertEquals(expectedResult, actualResult, "Test failed for username: $usernameInput")
    }

    @Test
    fun validateUsernameTest7() {
        val usernameInput = "sudarshan.mhasrup"
        val expectedResult = true
        val actualResult = usernameValidator.validateUsername(usernameInput)
        assertEquals(expectedResult, actualResult, "Test failed for username: $usernameInput")
    }

    @Test
    fun validateUsernameTest8() {
        val usernameInput = "user123"
        val expectedResult = true
        val actualResult = usernameValidator.validateUsername(usernameInput)
        assertEquals(expectedResult, actualResult, "Test failed for username: $usernameInput")
    }

    @Test
    fun validateUsernameTest9() {
        val usernameInput = "user-name"
        val expectedResult = false
        val actualResult = usernameValidator.validateUsername(usernameInput)
        assertEquals(expectedResult, actualResult, "Test failed for username: $usernameInput")
    }

    @Test
    fun validateUsernameTest10() {
        val usernameInput = "user_name-123"
        val expectedResult = false
        val actualResult = usernameValidator.validateUsername(usernameInput)
        assertEquals(expectedResult, actualResult, "Test failed for username: $usernameInput")
    }

    @Test
    fun formatUsernameTest1() {
        val usernameInput = "sudarshan@mhasrup"
        val expectedResult = "sudarshanmhasrup"
        val actualResult = usernameValidator.formatUsername(usernameInput)
        assertEquals(expectedResult, actualResult, "Test to format username: $usernameInput")
    }

    @Test
    fun formatUsernameTest2() {
        val usernameInput = "sudarshan mhasrup"
        val expectedResult = "sudarshanmhasrup"
        val actualResult = usernameValidator.formatUsername(usernameInput)
        assertEquals(expectedResult, actualResult, "Test to format username: $usernameInput")
    }

    @Test
    fun formatUsernameTest3() {
        val usernameInput = ".sudarshan-mhasrup"
        val expectedResult = ".sudarshanmhasrup"
        val actualResult = usernameValidator.formatUsername(usernameInput)
        assertEquals(expectedResult, actualResult, "Test to format username: $usernameInput")
    }
}
