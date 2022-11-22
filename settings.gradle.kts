pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven("https://raw.githubusercontent.com/luk1337/camerax_selfie/3e725bb88ce66fca57ae5a45eaab40c6625cfdfb/.m2")
        google()
        mavenCentral()
    }
}
rootProject.name = "LeOS-Cam"
include(":app")
