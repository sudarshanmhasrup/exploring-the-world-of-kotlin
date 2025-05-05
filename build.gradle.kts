plugins {
    alias(libs.plugins.kotlin.compiler) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.android.application) apply false
}

// Custom build directory
layout.buildDirectory.set(file("$rootDir/.build/rootProject"))