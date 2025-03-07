plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlinxSerialization)
    id("kotlin-parcelize")
}

android {
    namespace = "com.example.amazingapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.amazingapp"
        minSdk = 24
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation(libs.glide)

    implementation(libs.ktorAndroid)
    implementation(libs.ktorCore)
    implementation(libs.ktorUtils)

    implementation(libs.okhttp.logging.interceptor)
    implementation(libs.okhttp3.okhttp)

    implementation(libs.androidxLifecycleProcess)
    implementation(libs.androidxLifecycleRuntimeKtx)
    implementation(libs.androidxLifecycleViewmodelSavedstate)
    implementation(libs.androidxLivedataKtx)
    implementation(libs.androidxActivityKtx)

    implementation(libs.kotlinxSerialization)

    implementation(libs.timber)
    implementation(libs.okhttp3.okhttp)
    implementation(libs.koin)
    implementation(libs.androidx.preference.ktx.ktx)
}