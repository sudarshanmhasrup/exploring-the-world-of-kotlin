### Kotlin Playground

This module serves as a playground for writing and running sample Kotlin code for testing and experimentation. Inspired
by [Kotlin Playground](https://play.kotlinlang.org), it allows you to run code directly in your IDE instead of a
browser, making it easier to try out external libraries and explore Kotlin in a flexible environment.

#### Running the Playground

Run the following Gradle command to start the playground. By default, Gradle runs
[Playground.kt](/kotlin-playground/src/main/kotlin/com/kotlin/playground/Playground.kt) since it’s set as the main
class.

```shell
  ./gradlew kotlin-playground:run
```

#### Running the Tests

The tests are located in the `src/test` directory under the `com.kotlin.playground` package. Run the following Gradle
command to execute the tests.

```shell
  ./gradlew kotlin-playground:test
```