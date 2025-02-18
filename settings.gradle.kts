rootProject.name = "ExploringTheWorldOfKotlin"

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

include(":practiceSolutions")
include(":coreKotlin")
include(":kotlinPlayground")