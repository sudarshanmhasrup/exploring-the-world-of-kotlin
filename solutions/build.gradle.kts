plugins {
    alias(libs.plugins.kotlin.jvm)
}

dependencies {
    testImplementation(libs.junit.jupiter.api)
    testImplementation(libs.junit.jupiter.engine)
}

// Customize build directory for solutions module
layout.buildDirectory.set(file("$rootDir/.build/solutions"))