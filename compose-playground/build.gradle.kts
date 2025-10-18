plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose.multiplatform)
}

group = libs.versions.composePlayground.group.get()
version = libs.versions.composePlayground.version.get()

kotlin {
    jvm()
}

// Custom build directory
layout.buildDirectory.set(file("$rootDir/.build/ComposePlayground"))