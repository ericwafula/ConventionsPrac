package tech.ericwathome.convention.extensions

import com.android.build.api.dsl.CommonExtension

internal fun configureAndroidCommon(
    extension: CommonExtension<*, *, *, *, *>
) {
    extension.apply {
        compileSdk = 33
        defaultConfig {
            minSdk = 21
            vectorDrawables {
                useSupportLibrary = true
            }
        }

        buildFeatures {
            compose = true
            aidl = false
            buildConfig = false
            renderScript = false
            shaders = false
        }

        packagingOptions {
            resources {
                excludes += "/META-INF/{AL2.0,LGPL2.1}"
            }
        }
    }
}