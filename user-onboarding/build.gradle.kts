plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
}

group = libs.versions.userOnboarding.groupId
version = libs.versions.userOnboarding.version

kotlin {
    // Declaring dummy targets to avoid build warnings
    jvm("desktop")

    androidTarget()

    iosX64()
    iosArm64()
    iosSimulatorArm64()
}

android {
    namespace = libs.versions.userOnboarding.groupId.get()
    compileSdk = libs.versions.androidApp.compileSdkVersion.get().toInt()
}

// Custom build directory
layout.buildDirectory.set(file("$rootDir/.build/userOnboarding"))