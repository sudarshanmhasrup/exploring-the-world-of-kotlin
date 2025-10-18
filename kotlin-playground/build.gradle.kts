plugins {
    alias(libs.plugins.application)
    alias(libs.plugins.kotlin.jvm)
}

group = libs.versions.kotlinPlayground.group.get()
version = libs.versions.kotlinPlayground.version.get()

// Custom build directory
layout.buildDirectory.set(file("$rootDir/.build/KotlinPlayground"))