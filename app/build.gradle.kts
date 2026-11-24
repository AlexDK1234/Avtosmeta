plugins { id("com.android.application") }

android {
    namespace = "ru.avtosmeta.app"
    compileSdk = 34
    defaultConfig {
        applicationId = "ru.avtosmeta.app"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    sourceSets["main"].assets.srcDir("../docs")
    buildTypes { release { isMinifyEnabled = false } }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
