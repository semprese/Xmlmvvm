plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
//    id("kotlin-kapt")
//    kotlin("kapt")
//    version "2.1.0"
    id ("com.google.devtools.ksp")
    id ("androidx.navigation.safeargs.kotlin")
    id("com.google.dagger.hilt.android")

}

android {
    namespace = "com.bignerdranch.android.myapplication"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.bignerdranch.android.myapplication"
        minSdk = 29
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)


    implementation (libs.androidx.navigation.dynamic.features.fragment)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    //retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.6.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.6.0")
    implementation ("com.squareup.okhttp3:logging-interceptor:4.5.0")
    // Room

    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.room.ktx)
    ksp("androidx.room:room-compiler:2.5.0")

//    annotationProcessor ("android.arch.persistence.room:compiler:1.0.0")
    implementation("com.google.dagger:hilt-android:2.51.1")
    ksp("com.google.dagger:hilt-compiler:2.51.1")
    // Glide
    implementation ("com.github.bumptech.glide:glide:4.11.0")
//    kapt ("com.github.bumptech.glide:compiler:4.11.0")
}