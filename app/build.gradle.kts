plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.android.apis"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.android.apis"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildFeatures {
        aidl = true
    }

    sourceSets["main"].apply {
        aidl.setSrcDirs(listOf("src/main/java"))
    }
}

dependencies {
    implementation("androidx.core:core:1.13.1")
}