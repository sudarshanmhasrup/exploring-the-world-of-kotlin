class UsernameValidator {

    // Function to format the username
    fun formatUsername(username: String): String {

        val formattedUsername = mutableListOf<Char>()

        for (i in username) {
            if (i != ' ') {
                formattedUsername.add(i.lowercaseChar())
            }
        }

        return formattedUsername.joinToString(
            separator = ""
        )
    }

    // Function to check if username is valid or not
    fun validateUsername(username: String): Boolean {

        var isValidUsername = false

        // Initial check
        isValidUsername = when {
            username.isEmpty() -> {
                false
            }
            username[0].isDigit() -> {
                false
            }
            !username[0].isLetter() || username[0] != '_' -> {
                false
            }
            else -> {
                true
            }
        }

        // Return false if the isValidUsername is still set to false
        if (!isValidUsername) {
            return false
        }

        for (i in username) {
            isValidUsername = i.isLetter() || i.isLetter() || i in listOf('.', '_', '-')
        }

        return isValidUsername
    }
}