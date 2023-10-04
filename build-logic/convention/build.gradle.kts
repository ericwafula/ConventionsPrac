plugins {
    `kotlin-dsl`
}

group = "tech.ericwathome.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    compileOnly(libs.android.gradle.plugin)
    compileOnly(libs.kotlin.gradle.plugin)
}

gradlePlugin {
    plugins {
        create("androidApplication") {
            id = "compositebuild.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        create("kotlinAndroid") {
            id = "compositebuild.kotlin.android"
            implementationClass = "AndroidKotlinConventionPlugin"
        }
    }
}