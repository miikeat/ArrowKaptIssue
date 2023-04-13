plugins {
    kotlin("jvm") version "1.8.10"
    application
    kotlin("kapt") version "1.8.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    google()
}

dependencies {
    kapt("com.datastax.oss:java-driver-mapper-processor:4.15.0")
    //kapt("androidx.room:room-compiler:2.5.0")

    // Diff between alpha 73 & 74: https://github.com/arrow-kt/arrow/compare/1.1.6-alpha.73...1.1.6-alpha.74
    //implementation("io.arrow-kt:arrow-core:1.1.6-alpha.73") // Last working Version
    //implementation("io.arrow-kt:arrow-core:1.1.6-alpha.74") // First Version with that Issue
    implementation("io.arrow-kt:arrow-core:1.2.0-RC")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(19)
}

application {
    mainClass.set("MainKt")
}