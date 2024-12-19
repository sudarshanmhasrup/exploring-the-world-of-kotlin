plugins {
    alias(libs.plugins.kotlin.jvm)
}

dependencies {
    testImplementation(libs.junit.jupiter.api)
}

// Customize build directory
layout.buildDirectory.set(file("$rootDir/.build/solutions"))