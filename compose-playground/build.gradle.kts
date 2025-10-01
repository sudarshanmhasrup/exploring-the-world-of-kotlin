plugins {
    alias(libs.plugins.kotlin.multiplatform)
}

kotlin {
    jvm()
}

// Custom build directory
layout.buildDirectory.set(file(".build/ComposePlayground"))