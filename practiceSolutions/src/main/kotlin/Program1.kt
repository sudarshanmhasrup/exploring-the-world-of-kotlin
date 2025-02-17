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
    val firstNumber = getUserInput(placeholder = "Enter the first number: ")
    val secondNumber = getUserInput(placeholder = "Enter the second number: ")
    onUserInputReceived(firstNumber, secondNumber)
}

private fun getUserInput(placeholder: String): Int {
    var userInput: Int? = null
    // Read and convert user input to integer or throw and show error message
    do {
        print(placeholder)
        userInput = try {
            readln().toInt()
        } catch (_: Exception) {
            println("Please enter a valid number!")
            null
        }
    } while (userInput == null)
    return userInput
}

fun displayResult(firstNumber: Int, secondNumber: Int) {
    val result = addition(firstNumber = firstNumber, secondNumber = secondNumber)
    println("The addition of $firstNumber and $secondNumber is $result .")
}

private fun addition(firstNumber: Int, secondNumber: Int): Int = firstNumber + secondNumber