import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "2.0.10"
}

group = "pixel.botkt"
version = "1.0.0"

subprojects {
    group = rootProject.group
    version = rootProject.version
}

allprojects {

    repositories {
        mavenCentral()
    }

    tasks.withType<KotlinCompile> {
        kotlin {
            jvmToolchain(21)
        }
    }

}
