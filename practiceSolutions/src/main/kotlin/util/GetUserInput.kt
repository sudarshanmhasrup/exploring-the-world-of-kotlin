package util

@Suppress("KotlinConstantConditions")
fun <Any> getUserInput(placeholder: String, errorMessage: String, userInputLogic: () -> Any?): Any? {
    var userInput: Any?
    // Read and convert user input to required form or throw and show error message
    do {
        print(placeholder)
        userInput = userInputLogic()
        if (userInput == null) {
            println(errorMessage)
            continue
        } else {
            break
        }
    } while (userInput == null)
    return userInput
}