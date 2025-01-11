
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
//    id ("org.jetbrains.kotlin.android") version ("1.8.0") apply false
    id("com.google.devtools.ksp") version "2.0.0-1.0.21" apply false

}
buildscript{
    dependencies {
        val nav_version = "2.8.5"
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version")
    }
}


