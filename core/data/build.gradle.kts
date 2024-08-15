plugins {
    alias(libs.plugins.project.android.library)
    alias(libs.plugins.project.hilt)
//    id("kotlinx-serialization")
}

android {
    namespace = "com.sean8.jeminai.core.data"
    testOptions {
        unitTests {
            isIncludeAndroidResources = true
            isReturnDefaultValues = true
        }
    }
}

dependencies {
    implementation(project(":core:datastore"))

    testImplementation(libs.kotlinx.coroutines.test)
    testImplementation(libs.kotlinx.serialization.json)
    testImplementation(project(":core:testing"))
//    testImplementation(project(":core:datastoreTest"))
}
