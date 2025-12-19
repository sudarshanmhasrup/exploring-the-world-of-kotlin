rootProject.name = "ExploringTheWorldOfKotlin"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
    }
}

// Playground modules
val playgroundModules = setOf("kotlin", "compose")
playgroundModules.forEach { module ->
    include(":$module-playground")
}

// Other modules
val otherModules = setOf("trying-kotlin", "practice-solutions")
otherModules.forEach { module ->
    include(":$module")
}