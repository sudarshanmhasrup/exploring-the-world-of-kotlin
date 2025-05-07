import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.compiler)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.compose.compiler)
}

dependencies {
    implementation(compose.desktop.currentOs)
    implementation(project(":compose-app"))
}

kotlin.compilerOptions {
    jvmTarget = JvmTarget.JVM_11
}

java {
    targetCompatibility = JavaVersion.VERSION_11
    sourceCompatibility = JavaVersion.VERSION_11
}

compose.desktop {
    application {
        mainClass = "com.compose.desktop.MainKt"
    }
}

// Custom build directory
layout.buildDirectory.set(file("$rootDir/.build/desktopApp"))