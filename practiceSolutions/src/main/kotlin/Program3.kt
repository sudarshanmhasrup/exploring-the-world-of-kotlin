import util.*

/*
  Problem statement no: 03.
  Problem statement: Create a function that takes a number as an argument, increments the number by +1 and returns the
  result.
  Source: https://edabit.com/challenge/NAQhEoxbofPidLxm9
*/

// Solution
fun main() {
    val number = getNumberFromTheUser()
    display(number = number)
}

private fun getNumberFromTheUser(): Int {
    return getUserInput(
        placeholder = "Enter any integer number: ",
        errorMessage = "Please enter a valid valid!",
        userInputLogic = { readln().toIntOrNull() }
    ) ?: 0
}

private fun display(number: Int) {
    println("The number you have entered is: $number.")
    println("Output is: ${incrementNumber(number = number)}.")
}

private fun incrementNumber(number: Int): Int = number + 1
