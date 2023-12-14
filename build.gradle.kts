import org.jetbrains.kotlin.gradle.tasks.KotlinCompile


plugins {
    id("org.springframework.boot") version "3.2.0"
    id("io.spring.dependency-management") version "1.1.4" apply false
    kotlin("jvm") version "1.9.20" apply false
    kotlin("plugin.spring") version "1.9.20" apply false
}



allprojects{
    group = "com.prac"
    version = "0.0.1-SNAPSHOT"
    repositories {
        mavenCentral()
    }

    dependencies{
        org.jetbrains.kotlin.gradle.utils.IMPLEMENTATION("com.fasterxml.jackson.module:jackson-module-kotlin:2.14.2")
    }

}

subprojects{
    apply(plugin = "org.jetbrains.kotlin.jvm");
    apply(plugin = "org.jetbrains.kotlin.plugin.spring");
    apply(plugin = "org.springframework.boot");
    apply(plugin = "io.spring.dependency-management");

}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = "17"
    }
}
