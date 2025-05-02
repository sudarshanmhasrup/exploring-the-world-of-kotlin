plugins {
    alias(libs.plugins.kotlin.compiler) apply false
}

// Custom build directory
layout.buildDirectory.set(file("$rootDir/.build/rootProject"))