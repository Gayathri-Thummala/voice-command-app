pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        //maven { url =uri("https://oss.sonatype.org/content/repositories/releases")}
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        //implementation group: 'com.alphacephei', name: 'vosk-android', version: '0.3.32+'
        //maven { url = uri("https://oss.sonatype.org/content/repositories/snapshots/") }
    }
}

rootProject.name = "My Application"
include(":app")
