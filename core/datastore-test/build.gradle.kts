plugins {
    alias(libs.plugins.project.android.library)
    alias(libs.plugins.project.hilt)
}

android {
    namespace = "com.sean8.jeminai.core.datastore.test"
}

dependencies {
    implementation(libs.hilt.android.testing)
//    implementation(project(":core:common"))
    implementation(project(":core:datastore"))

}
