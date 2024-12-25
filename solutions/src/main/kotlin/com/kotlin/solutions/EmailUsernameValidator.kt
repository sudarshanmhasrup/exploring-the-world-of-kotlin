package com.kotlin.solutions

class EmailUsernameValidator {

    // Function to format email address username
    fun formatUsername(username: String): String {

        val formattedUsername = mutableListOf<Char>()

        for (i in username) {
            if (i.isLetterOrDigit() || i == '.') {
                formattedUsername.add(i)
            }
        }

        return formattedUsername.joinToString("")
    }

    // Function to validate email address username
    fun validateUsername(username: String): Boolean {

        if (username.length !in 6..64 || !username.first().isLetter() || !username.last().isLetterOrDigit()) {
            return false
        }

        for (i in username) {
            if (i.isLetterOrDigit() || i == '.') {
                continue
            } else {
                return false
            }
        }

        return ".." !in username
    }
}