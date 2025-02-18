import util.getUserInput
import java.util.logging.Logger

/*
  Problem statement no: 01.
  Problem statement: Create a function that takes two numbers as arguments and returns their sum.
  Source: https://edabit.com/challenge/3LpBLgNRyaHMvNb4j
*/

// Solution
fun main() {
    getUserInputs(
        onUserInputReceived = { firstNumber, secondNumber ->
            displayResult(firstNumber = firstNumber, secondNumber = secondNumber)
        }
    )
}

private fun getUserInputs(onUserInputReceived: (Int, Int) -> Unit) {
    val userInputLogic: () -> Int? = { readln().toIntOrNull() }
    val errorMessage = "Please enter a valid number."
    val firstNumber = getUserInput(
        placeholder = "Enter the first number: ",
        errorMessage = errorMessage,
        userInputLogic = userInputLogic
    ) ?: 0
    val secondNumber = getUserInput(
        placeholder = "Enter the second number: ",
        errorMessage = errorMessage,
        userInputLogic = userInputLogic
    ) ?: 0
    onUserInputReceived(firstNumber, secondNumber)
}

fun displayResult(firstNumber: Int, secondNumber: Int) {
    val result = addition(firstNumber = firstNumber, secondNumber = secondNumber)
    println("The addition of $firstNumber and $secondNumber is $result.")
}

private fun addition(firstNumber: Int, secondNumber: Int): Int = firstNumber + secondNumber