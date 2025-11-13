plugins {
    alias(libs.plugins.kotlin.jvm)
}

// Custom build directory
layout.buildDirectory.set(file("$rootDir/.build/trying-kotlin"))