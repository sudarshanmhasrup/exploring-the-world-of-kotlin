plugins {

}

group = libs.versions.practiceSolutions.group.get()
version = libs.versions.practiceSolutions.version.get()

// Custom build directory
layout.buildDirectory.set(file("$rootDir/.build/PracticeSolutions"))