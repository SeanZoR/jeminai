pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "jeminai"

include(":core:testing")
include(":core:data")
include(":core:datastore")
include(":core:datastore-proto")
include(":core:datastore-test")
include(":core:model")

include(":feature:settings")

include(":app")