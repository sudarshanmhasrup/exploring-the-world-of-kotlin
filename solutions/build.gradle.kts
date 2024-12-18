plugins {
    alias(libs.plugins.kotlin.jvm)
}

dependencies {

}

// Customize build directory
layout.buildDirectory.set(file("$rootDir/.build/solutions"))