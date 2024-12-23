package com.kotlin.solutions

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class UsernameValidatorTest {

    private val usernameValidator = UsernameValidator()

    @Test
    fun validateUsernameTest1() {

        val usernameInput = "do"

        val expectedResult = false
        val actualResult = usernameValidator.validateUsername(usernameInput)

        assertEquals(expectedResult, actualResult)
    }
}