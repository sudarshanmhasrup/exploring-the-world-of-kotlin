plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.compose.compiler)
}

group = libs.versions.designSystem.groupId.get()
version = libs.versions.designSystem.version.get()

kotlin {
    // Declaring dummy targets to avoid build warnings
    jvm("desktop")

    androidTarget()

    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        commonMain.dependencies {
            implementation(libs.compose.multiplatform.resources)
            implementation(libs.compose.multiplatform.ui)
        }
    }
}

android {
    namespace = libs.versions.designSystem.groupId.get()
    compileSdk = libs.versions.androidApp.compileSdkVersion.get().toInt()
}

// Custom build directory
layout.buildDirectory.set(file("$rootDir/.build/designSystem"))