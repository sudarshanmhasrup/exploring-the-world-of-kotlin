plugins {
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.android.application)
    alias(libs.plugins.compose.compiler)
}

group = libs.versions.androidApp.groupId.get()
version = libs.versions.androidApp.version.get()

android {
    namespace = libs.versions.androidApp.applicationId.get()
    compileSdk = libs.versions.androidApp.compileSdkVersion.get().toInt()

    defaultConfig {
        applicationId = libs.versions.androidApp.applicationId.get()
        compileSdk = libs.versions.androidApp.compileSdkVersion.get().toInt()
        targetSdk = libs.versions.androidApp.targetSdkVersion.get().toInt()
        minSdk = libs.versions.androidApp.minSdkVersion.get().toInt()
        version = libs.versions.androidApp.versionCode.get().toInt()
        versionName = libs.versions.androidApp.versionName.get()
    }
    compileOptions {
        targetCompatibility = JavaVersion.VERSION_11
        sourceCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(libs.core.splashscreen)
    implementation(libs.activity.compose)
    implementation(project(":compose-app"))
}

// Custom build directory
layout.buildDirectory.set(file("$rootDir/.build/androidApp"))