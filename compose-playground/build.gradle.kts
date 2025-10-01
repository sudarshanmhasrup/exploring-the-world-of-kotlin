plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.compose.compiler)
}

group = libs.versions.composePlayground.group.get()
version = libs.versions.composePlayground.version.get()

kotlin {
    jvm()

    sourceSets {
        jvmMain.dependencies {
            implementation(compose.desktop.currentOs)
        }
    }
}

compose.desktop {
    application {
        mainClass = libs.versions.composePlayground.mainClass.get()
    }
}

// Custom build directory
layout.buildDirectory.set(file("$rootDir/.build/ComposePlayground"))