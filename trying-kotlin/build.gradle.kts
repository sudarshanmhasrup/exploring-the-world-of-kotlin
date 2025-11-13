plugins {
    alias(libs.plugins.kotlin.jvm)
}

group = libs.versions.tryingKotlin.group.get()
version = libs.versions.tryingKotlin.version.get()

// Custom build directory
layout.buildDirectory.set(file("$rootDir/.build/trying-kotlin"))