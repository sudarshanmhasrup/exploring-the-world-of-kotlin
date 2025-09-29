plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.application)
}

group = libs.versions.kotlinPlayground.group.get()
version = libs.versions.kotlinPlayground.version.get()

application {
    mainClass = libs.versions.kotlinPlayground.mainClass.get()
}

dependencies {
    testImplementation(libs.kotlin.test)
}

// Custom build directory
layout.buildDirectory.set(file("$rootDir/.build/KotlinPlayground"))