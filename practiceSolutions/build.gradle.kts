plugins {
    alias(libs.plugins.kotlin.compiler)
}

dependencies {
    testImplementation(libs.kotlin.test)
}

// Custom build directory
layout.buildDirectory.set(file("$rootDir/.build/practiceSolutions"))