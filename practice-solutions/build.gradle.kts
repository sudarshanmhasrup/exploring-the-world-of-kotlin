import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.jvm)
}

group = libs.versions.practiceSolutions.group.get()
version = libs.versions.practiceSolutions.version.get()

dependencies {
    implementation(libs.jetbrains.annotations)
    testImplementation(libs.kotlin.test)
}

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

tasks.test {
    useJUnitPlatform()
}

// Custom build directory
layout.buildDirectory.set(file("$rootDir/.build/PracticeSolutions"))