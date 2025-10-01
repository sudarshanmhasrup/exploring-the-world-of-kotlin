import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.jvm)
}

group = libs.versions.tryingKotlin.group.get()
version = libs.versions.tryingKotlin.version.get()

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of("23")
    }
    sourceCompatibility = JavaVersion.VERSION_23
    targetCompatibility = JavaVersion.VERSION_23
}

kotlin {
    compilerOptions {
        jvmTarget.set(JvmTarget.JVM_23)
    }
}

// Custom build directory
layout.buildDirectory.set(file("$rootDir/.build/TryingKotlin"))