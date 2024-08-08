import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import java.time.LocalDateTime

plugins {
    kotlin("jvm") version "2.0.10"
    id("com.diffplug.spotless") version "7.0.0.BETA1"
}

group = "pixel.botkt"
version = "1.0.0"

subprojects {
    group = rootProject.group
    version = rootProject.version
}

allprojects {

    apply(plugin = "com.diffplug.spotless")

    repositories {
        mavenCentral()
    }

    tasks.withType<KotlinCompile> {
        kotlin {
            jvmToolchain(21)
        }
    }

    spotless {
        kotlin {
            licenseHeader(rootProject.file("LICENSE-HEADER").readText().replace("[yyyy]", LocalDateTime.now().year.toString()) + "\n\n")
            ktfmt("0.49").kotlinlangStyle().configure {
                it.setMaxWidth(80)
                it.setBlockIndent(4)
                it.setContinuationIndent(4)
                it.setRemoveUnusedImport(false)
            }
        }
    }

}


