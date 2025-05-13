plugins {
    alias(libs.plugins.kotlin.compiler) apply false
}

layout.buildDirectory.set(file("$rootDir/.build/rootProject"))