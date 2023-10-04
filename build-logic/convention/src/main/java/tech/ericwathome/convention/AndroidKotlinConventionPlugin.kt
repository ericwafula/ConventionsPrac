package tech.ericwathome.convention

import com.android.build.api.dsl.ApplicationExtension
import com.android.build.api.dsl.LibraryExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import tech.ericwathome.convention.extensions.configureKotlin

class AndroidKotlinConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(plugins) {
                apply("org.jetbrains.kotlin.android")
            }

            extensions.findByType(ApplicationExtension::class.java)?.apply {
                configureKotlin(this)
            }

            extensions.findByType(LibraryExtension::class.java)?.apply {
                configureKotlin(this)
            }
        }
    }
}