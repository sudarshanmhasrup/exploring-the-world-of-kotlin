package com.kotlin.solutions

class EmailAddressValidator {

    private val emailUsernameValidator = EmailUsernameValidator()
    
    // Email address validator
    fun emailAddressValidator(emailAddress: String): Boolean {

        val splitEmailAddressParts = emailAddress.split("@")
        val emailUsername = splitEmailAddressParts[0]
        val domainNameAddress = splitEmailAddressParts[1]

        return emailUsernameValidator.validateUsername(emailUsername) && domainNameValidator(domainNameAddress)
    }


    private fun domainNameValidator(domainNameAddress: String): Boolean {

        val spiltDomainName = domainNameAddress.split(".")
        val secondLevelDomainName = spiltDomainName[0]
        val topLevelDomainName = spiltDomainName[1]

        return validateSecondLevelDomainName(secondLevelDomainName) && validateTopLevelDomainName(topLevelDomainName)
    }

    // Function to validate second level domain name
    private fun validateSecondLevelDomainName(secondLevelDomainName: String): Boolean {
        if (secondLevelDomainName.isEmpty() || !secondLevelDomainName.first().isLetterOrDigit() || !secondLevelDomainName.last().isLetterOrDigit()) {
            return false
        }

        for (i in secondLevelDomainName) {
            if (i.isLetterOrDigit() || i == '-') {
                continue
            } else {
                return false
            }
        }

        return "--" !in secondLevelDomainName
    }

    // Function to validate top level domain name
    private fun validateTopLevelDomainName(topLevelDomainName: String): Boolean {
        if (topLevelDomainName.isEmpty() || !topLevelDomainName.first().isLetterOrDigit() || !topLevelDomainName.last().isLetter()) {
            return false
        }
        for (i in topLevelDomainName) {
            if (i.isLetterOrDigit()) {
                continue
            } else {
                return false
            }
        }
        return true
    }
}