plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}

rootProject.name = "BotKt"

include("botkt-application", "botkt-core")
