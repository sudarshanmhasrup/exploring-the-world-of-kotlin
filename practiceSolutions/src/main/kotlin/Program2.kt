import util.getUserInput

/*
  Problem statement no: 01.
  Problem statement: Write a function that takes an integer minutes and converts it to seconds.
  Source: https://edabit.com/challenge/8q54MKnRrm89pSLmW
*/

// Solution
fun main() {
    val userInput = getUserInput(
        placeholder = "Enter minutes in digit: ",
        errorMessage = "Please enter minutes in digit only!",
        userInputLogic = { readln().toIntOrNull() }
    ) ?: 0
    display(minutes = userInput)
}

private fun display(minutes: Int) {
    val minutesInSeconds = convertMinutesToSeconds(minutes)
    val minutesSuffix = if (minutes == 1) "minute" else "minutes"
    val secondsSuffix = if (minutesInSeconds == 1) "second" else "seconds"
    println("$minutes $minutesSuffix in seconds: $minutesInSeconds $secondsSuffix.")
}

private fun convertMinutesToSeconds(minutes: Int): Int = minutes * 60