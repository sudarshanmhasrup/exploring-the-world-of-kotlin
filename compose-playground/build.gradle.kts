plugins {
    alias(libs.plugins.kotlin.multiplatform)
}

kotlin {
    jvm()
}

// Custom build directory
layout.buildDirectory.set(file("$rootDir/.build/ComposePlayground"))