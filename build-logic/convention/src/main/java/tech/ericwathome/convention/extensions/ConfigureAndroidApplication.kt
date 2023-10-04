package tech.ericwathome.convention.extensions

import com.android.build.api.dsl.ApplicationExtension

internal fun configureAndroidApplication(
    extension: ApplicationExtension
) {
    extension.apply {
        defaultConfig {
            applicationId = "tech.ericwathome.buildlogic"
            versionCode = 1
            versionName = "1.0"
            targetSdk = 33
        }
    }
}