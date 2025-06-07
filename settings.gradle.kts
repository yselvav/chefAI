pluginManagement {
    repositories {
        maven("https://maven.fabricmc.net")
        mavenCentral()
        gradlePluginPortal()
        maven("https://jitpack.io")
    }
    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                "com.replaymod.preprocess" -> {
                    useModule("com.github.replaymod:preprocessor:${requested.version}")
                }
            }
        }
    }
}

rootProject.name = "altoclef"
rootProject.buildFileName = "root.gradle.kts"

listOf(
    "1.21.1"
).forEach { version ->
    include(":$version")
    project(":$version").apply {
        projectDir = file("versions/$version")
        buildFileName = "../../build.gradle"
        name = version
    }
}
