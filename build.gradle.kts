val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project
val koin_version: String by project

plugins {
    application
    kotlin("jvm") version "1.7.10"
    id("io.ktor.plugin") version "2.1.0"
    id("org.jetbrains.kotlin.plugin.serialization") version "1.7.10"
}

group = "com.example"
version = "0.0.1"
application {
    mainClass.set("io.ktor.server.netty.EngineMain")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core-jvm:$ktor_version")
    implementation("io.ktor:ktor-server-call-logging-jvm:$ktor_version")
    implementation("io.ktor:ktor-server-call-id-jvm:$ktor_version")
    implementation("ch.qos.logback:logback-classic:$logback_version")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")

    implementation("io.ktor:ktor-server-content-negotiation-jvm:$ktor_version")

    // JW
    implementation("io.ktor:ktor-server-auth-jvm:$ktor_version")
    testImplementation("io.ktor:ktor-server-tests-jvm:$ktor_version")

    // JWT Auth
    implementation("io.ktor:ktor-server-auth-jwt-jvm:$ktor_version")

    // Ktorm Core   KTORM
    implementation("org.ktorm:ktorm-core:3.5.0")
    implementation("org.ktorm:ktorm-support-mysql:3.5.0")

    // Mysql Connector
    implementation("mysql:mysql-connector-java:8.0.30")


    // Serializations
    implementation("io.ktor:ktor-serialization-jackson-jvm:$ktor_version")
    implementation("io.ktor:ktor-serialization-gson-jvm:$ktor_version")
    implementation("io.ktor:ktor-serialization-kotlinx-json-jvm:$ktor_version")

    // Netty
    implementation("io.ktor:ktor-server-netty-jvm:$ktor_version")

    // Session
    implementation("io.ktor:ktor-server-sessions-jvm:$ktor_version")

    implementation("commons-codec:commons-codec:1.15")

    // Koin for Ktor
    implementation("io.insert-koin:koin-ktor:$koin_version")
    implementation("io.insert-koin:koin-logger-slf4j:$koin_version")
}