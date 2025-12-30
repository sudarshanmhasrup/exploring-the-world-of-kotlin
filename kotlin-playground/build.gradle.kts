import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.application)
    alias(libs.plugins.kotlin.jvm)
}

group = libs.versions.kotlinPlayground.group.get()
version = libs.versions.kotlinPlayground.version.get()

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

dependencies {
    implementation(libs.couroutines)
    testImplementation(libs.kotlin.test)
}

application {
    mainClass = libs.versions.kotlinPlayground.mainClass.get()
}

tasks.test {
    useJUnitPlatform()
}

// Custom build directory
layout.buildDirectory.set(file("$rootDir/.build/kotlin-playground"))