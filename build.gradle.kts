plugins {
    alias(libs.plugins.kotlin.jvm) apply false
}

// Custom build directory
layout.buildDirectory.set(file(".build/RootProject"))