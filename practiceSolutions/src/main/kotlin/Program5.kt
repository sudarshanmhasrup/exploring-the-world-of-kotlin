import util.*

/*
  Problem statement no: 05.
  Problem statement: Create a function that takes the age in years and returns the age in days.
  Modified: True.
  Source: https://edabit.com/challenge/bL7hSc6Zh4zZJzGmw
*/

// Solution
fun main() {
    askUserAge(onUserInputReceived = { display(ageInYears = it) })
}

private fun askUserAge(onUserInputReceived: (Int) -> Unit) {
    val userInput = getUserInput(
        placeholder = "Enter your age in years: ",
        errorMessage = "Please enter age in whole numbers only!",
        userInputLogic = { readln().toIntOrNull() }
    ) ?: 0
    onUserInputReceived(userInput)
}

private fun display(ageInYears: Int) {
    println("You're ${convertAgeYearsToDays(ageInYears = ageInYears)} years old.")
}

private fun convertAgeYearsToDays(ageInYears: Int): Int = ageInYears * 365