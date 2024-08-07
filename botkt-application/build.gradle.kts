plugins {
    kotlin("jvm")
    application
}

dependencies {
    api(project(":botkt-core"))
}

application {
    mainClass.set("pixel.botkt.application.BotApplicationKt")
}
