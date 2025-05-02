import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.compiler)
}

dependencies {
    
}

java {
    targetCompatibility = JavaVersion.VERSION_11
    sourceCompatibility = JavaVersion.VERSION_11
}

kotlin.compilerOptions {
    jvmTarget = JvmTarget.JVM_11
}

tasks.test {
    useJUnitPlatform()
}

// Custom build directory
layout.buildDirectory.set(file("$rootDir/.build/practiceSolutions"))