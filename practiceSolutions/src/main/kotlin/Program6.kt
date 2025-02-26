import util.*

/*
  Problem statement no: 06.
  Problem statement: Create a function that takes an array containing only numbers and return the first element.
  Modified: True.
  Source: https://edabit.com/challenge/QaApgtePE6QrCZ64o
*/

// Solution
fun main() {
    getArrayElementsFromUser(onUserInputReceived = { display(array = it) })
}

fun getArrayElementsFromUser(onUserInputReceived: (Array<Int>) -> Unit) {
    val userInputLogic: () -> Int? = { readln().toIntOrNull() }
    val numberOfArrayElements = getUserInput(
        placeholder = "How many elements do you want in the array?: ",
        errorMessage = "Please enter array element quantity in integer only!",
        userInputLogic = userInputLogic
    ) ?: 1

    // Declare an array with predefined size
    val array = Array(numberOfArrayElements) { 0 }

    // Get array elements from the user
    for (i in 0 until numberOfArrayElements) {
        val arrayElement = getUserInput(
            placeholder = "Value of array element at index $i: ",
            errorMessage = "Please enter array element value in integer only!",
            userInputLogic = userInputLogic
        ) ?: 0
        array[i] = arrayElement
    }
    onUserInputReceived(array)
}

fun display(array: Array<Int>) {
    println("The first element of given array is: ${getFirstElementOfArray(array = array)}.")
}

fun getFirstElementOfArray(array: Array<Int>): Int = array.first()