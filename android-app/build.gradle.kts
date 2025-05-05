plugins {
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.android.application)
}

android {
    compileSdk = libs.versions.androidApp.compileSdkVersion.get().toInt()
    namespace = libs.versions.androidApp.applicationId.get()

    defaultConfig {
        applicationId = libs.versions.androidApp.applicationId.get()
        compileSdk = libs.versions.androidApp.compileSdkVersion.get().toInt()
        targetSdk = libs.versions.androidApp.targetSdkVersion.get().toInt()
        minSdk = libs.versions.androidApp.minSdkVersion.get().toInt()
        version = libs.versions.androidApp.versionCode.get().toInt()
        versionName = libs.versions.androidApp.versionName.get()
    }
}