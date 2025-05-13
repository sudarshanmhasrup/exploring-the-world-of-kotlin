plugins {
    alias(libs.plugins.kotlin.compiler) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.compose.compiler) apply false
}

layout.buildDirectory.set(file("$rootDir/.build/rootProject"))