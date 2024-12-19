import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class UsernameValidatorTest {

    private val validator = UsernameValidator()

    @Test
    fun formatUsernameTest1() {

        val usernameInput = "sudarshan mhasrup"
        val actualResult = validator.formatUsername(usernameInput)
        val expectedResult = "sudarshanmhasrup"

        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun formatUsernameTest2() {

        val usernameInput = "Sudarshan mhasrup"
        val actualResult = validator.formatUsername(usernameInput)
        val expectedResult = "sudarshanmhasrup"

        assertEquals(expectedResult, actualResult)
    }
}