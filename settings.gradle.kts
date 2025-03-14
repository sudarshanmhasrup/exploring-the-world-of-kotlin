rootProject.name = "ExploringTheWorldOfKotlin"

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

include(":tryingKotlin")
include(":kotlinPlayground")
include(":practiceSolutions")
include(":kotlinMultiplatform")
include(":serverApp")
include(":androidApp")