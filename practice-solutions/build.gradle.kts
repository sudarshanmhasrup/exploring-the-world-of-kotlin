import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.compiler)
}

group = libs.versions.practiceSolutions.groupId.get()
version = libs.versions.releaseVersion.get()

dependencies {

}

tasks.test {
    useJUnitPlatform()
}

java {
    targetCompatibility = JavaVersion.VERSION_11
    sourceCompatibility = JavaVersion.VERSION_11
}

kotlin.compilerOptions {
    jvmTarget = JvmTarget.JVM_11
}

layout.buildDirectory.set(file("$rootDir/.build/practiceSolutions"))