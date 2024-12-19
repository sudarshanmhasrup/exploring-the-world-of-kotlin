plugins {
    alias(libs.plugins.kotlin.jvm)
}

dependencies {
    testImplementation(libs.junit.jupiter.api)
    testImplementation(libs.junit.jupiter.engine)
}

// Customize build directory
layout.buildDirectory.set(file("$rootDir/.build/solutions"))