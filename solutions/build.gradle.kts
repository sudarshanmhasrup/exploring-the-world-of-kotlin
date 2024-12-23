plugins {
    alias(libs.plugins.kotlin.jvm)
}

dependencies {

}

// Customize build directory for solutions module
layout.buildDirectory.set(file("$rootDir/.build/solutions"))