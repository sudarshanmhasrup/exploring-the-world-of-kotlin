import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin)
}

kotlin {
    compilerOptions {
        jvmTarget = JvmTarget.JVM_11
    }
}

java {
    targetCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}