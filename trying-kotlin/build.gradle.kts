plugins {
    alias(libs.plugins.kotlin.compiler)
}

group = libs.versions.tryingKotlin.groupId.get()
version = libs.versions.releaseVersion.get()