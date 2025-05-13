plugins {
    alias(libs.plugins.kotlin.compiler) apply false
    alias(libs.plugins.kotlin.android) apply false
}

layout.buildDirectory.set(file("$rootDir/.build/rootProject"))