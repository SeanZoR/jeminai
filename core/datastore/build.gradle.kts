plugins {
    alias(libs.plugins.project.android.library)
    alias(libs.plugins.project.hilt)
}

android {
    defaultConfig {
        consumerProguardFiles("consumer-proguard-rules.pro")
    }
    namespace = "com.sean8.jeminai.core.datastore"
    testOptions {
        unitTests {
            isReturnDefaultValues = true
        }
    }
}

dependencies {
    implementation(project(":core:datastore-proto"))
    api(project(":core:model"))

    implementation(libs.androidx.dataStore)

    testImplementation(project(":core:datastore-test"))
    testImplementation(libs.kotlinx.coroutines.test)
}
