plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.jebrains.compose)
}

dependencies {
    implementation(compose.desktop.currentOs)
    implementation(libs.androix.collection)
}

compose.desktop {
    application {
        mainClass = "MainKt"
    }
}

// Customize build directory
layout.buildDirectory.set(file("$rootDir/.build/composeDesktop"))