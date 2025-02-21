import util.*

/*
  Problem statement no: 04.
  Problem statement: Write a function that takes the base and height of a triangle and return its area.
  Modified: True.
  Source: https://edabit.com/challenge/3CaszbdZYGN4otQD8
*/

// Solution
fun main() {
    getValueFromUser(
        onUserInputReceived = { base, height ->
            display(base = base, height = height)
        }
    )
}

private fun getValueFromUser(onUserInputReceived: (Int, Int) -> Unit) {
    val userInputLogic: () -> Int? = { readln().toIntOrNull() }
    val base = getUserInput(
        placeholder = "Value of base: ",
        errorMessage = "Please enter an integer value!",
        userInputLogic = userInputLogic
    ) ?: 0
    val height = getUserInput(
        placeholder = "Value of base: ",
        errorMessage = "Please enter an integer value!",
        userInputLogic = userInputLogic
    ) ?: 0
    onUserInputReceived(base, height)
}

private fun display(base: Int, height: Int) {
    println("The are of triangle is: ${calculateAreaOfTriangle(base = base, height = height)}")
}

private fun calculateAreaOfTriangle(base: Int, height: Int): Int = (base * height) / 2