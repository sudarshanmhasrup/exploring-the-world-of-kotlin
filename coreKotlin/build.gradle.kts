plugins {
    alias(libs.plugins.kotlin)
}

// Custom build directory
layout.buildDirectory.set(file("$rootDir/.build/coreKotlin"))