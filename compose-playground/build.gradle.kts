import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.compose.compiler)
}

group = libs.versions.composePlayground.group.get()
version = libs.versions.composePlayground.version.get()

kotlin {
    jvm("desktop") {
        java {
            toolchain {
                languageVersion = JavaLanguageVersion.of("21")
            }
            sourceCompatibility = JavaVersion.VERSION_21
            targetCompatibility = JavaVersion.VERSION_21
        }

        compilerOptions {
            jvmTarget = JvmTarget.JVM_21
        }
    }

    sourceSets {
        val desktopMain by getting
        desktopMain.dependencies {
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