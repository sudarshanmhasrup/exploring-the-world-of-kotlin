package com.kotlin.solutions

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class EmailAddressValidatorTest {

    private val emailAddressValidator = EmailAddressValidator()

    @Test
    fun validateEmailAddressTest1() {
        val emailAddressInput = "sudarshanmhasrup@gmail.com"
        val expectedResult = true
        val actualResult = emailAddressValidator.validateEmailAddress(emailAddressInput)
        assertEquals(expectedResult, actualResult, "Test failed for email address: $emailAddressInput")
    }

    @Test
    fun validateEmailAddressTest2() {
        val emailAddressInput = "sudarshanmhasrupgmail.com"
        val expectedResult = false
        val actualResult = emailAddressValidator.validateEmailAddress(emailAddressInput)
        assertEquals(expectedResult, actualResult, "Test failed for email address: $emailAddressInput")
    }

    @Test
    fun validateEmailAddressTest3() {
        val emailAddressInput = "sudarshanmhasrup@"
        val expectedResult = false
        val actualResult = emailAddressValidator.validateEmailAddress(emailAddressInput)
        assertEquals(expectedResult, actualResult, "Test failed for email address: $emailAddressInput")
    }

    @Test
    fun validateEmailAddressTest4() {
        val emailAddressInput = "sudarshan!@gmail.com"
        val expectedResult = false
        val actualResult = emailAddressValidator.validateEmailAddress(emailAddressInput)
        assertEquals(expectedResult, actualResult, "Test failed for email address: $emailAddressInput")
    }

    @Test
    fun validateEmailAddressTest5() {
        val emailAddressInput = "sudarshan@@gmail.com"
        val expectedResult = false
        val actualResult = emailAddressValidator.validateEmailAddress(emailAddressInput)
        assertEquals(expectedResult, actualResult, "Test failed for email address: $emailAddressInput")
    }

    @Test
    fun validateEmailAddressTest6() {
        val emailAddressInput = "sudarshan@subdomain.example.com"
        val expectedResult = true
        val actualResult = emailAddressValidator.validateEmailAddress(emailAddressInput)
        assertEquals(expectedResult, actualResult, "Test failed for email address: $emailAddressInput")
    }

    @Test
    fun validateEmailAddressTest7() {
        val emailAddressInput = "sudar shan@gmail.com"
        val expectedResult = false
        val actualResult = emailAddressValidator.validateEmailAddress(emailAddressInput)
        assertEquals(expectedResult, actualResult, "Test failed for email address: $emailAddressInput")
    }

    @Test
    fun validateEmailAddressTest8() {
        val emailAddressInput = "sudarshan@gmail"
        val expectedResult = false
        val actualResult = emailAddressValidator.validateEmailAddress(emailAddressInput)
        assertEquals(expectedResult, actualResult, "Test failed for email address: $emailAddressInput")
    }

    @Test
    fun validateEmailAddressTest9() {
        val emailAddressInput = "user1234@example.com"
        val expectedResult = true
        val actualResult = emailAddressValidator.validateEmailAddress(emailAddressInput)
        assertEquals(expectedResult, actualResult, "Test failed for email address: $emailAddressInput")
    }

    @Test
    fun validateEmailAddressTest10() {
        val emailAddressInput = "user-name@example.com"
        val expectedResult = false
        val actualResult = emailAddressValidator.validateEmailAddress(emailAddressInput)
        assertEquals(expectedResult, actualResult, "Test failed for email address: $emailAddressInput")
    }
}
