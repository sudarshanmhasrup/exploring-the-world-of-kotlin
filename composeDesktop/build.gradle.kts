plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.jebrains.compose)
}

dependencies {
    implementation(compose.desktop.currentOs)
}
