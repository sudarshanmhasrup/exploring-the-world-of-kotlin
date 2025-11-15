import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.jvm)
}

group = libs.versions.tryingKotlin.group.get()
version = libs.versions.tryingKotlin.version.get()

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of("21")
    }
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

kotlin {
    compilerOptions {
        jvmTarget.set(JvmTarget.JVM_21)
    }
}

// Custom build directory
layout.buildDirectory.set(file("$rootDir/.build/trying-kotlin"))