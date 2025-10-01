plugins {
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.multiplatform) apply false
}

// Custom build directory
layout.buildDirectory.set(file(".build/RootProject"))