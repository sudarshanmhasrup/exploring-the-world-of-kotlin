import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.application)
}

group = libs.versions.kotlinPlayground.group.get()
version = libs.versions.kotlinPlayground.version.get()

application {
    mainClass = libs.versions.kotlinPlayground.mainClass.get()
}

dependencies {
    testImplementation(libs.kotlin.test)
}

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

tasks.test {
    useJUnitPlatform()
}

// Custom build directory
layout.buildDirectory.set(file("$rootDir/.build/KotlinPlayground"))