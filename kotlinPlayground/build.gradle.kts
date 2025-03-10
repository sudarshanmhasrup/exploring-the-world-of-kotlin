plugins {
    alias(libs.plugins.kotlin.compiler)
}

// Custom build directory
layout.buildDirectory.set(file("$rootDir/.build/kotlinPlayground"))