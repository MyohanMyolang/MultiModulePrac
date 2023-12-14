import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "3.2.0"
    kotlin("plugin.spring") version "1.9.20"
    id("io.spring.dependency-management") version "1.1.4"
    kotlin("jvm") version "1.9.20"
}

java{
    sourceCompatibility = JavaVersion.VERSION_17
}


allprojects{
    group = "com.prac"
    version = "0.0.1-SNAPSHOT"
    repositories {
        mavenCentral()
    }

    apply(plugin = "org.jetbrains.kotlin.jvm");
    apply(plugin = "org.jetbrains.kotlin.plugin.spring");
    apply(plugin = "org.springframework.boot");
    apply(plugin = "io.spring.dependency-management");


    dependencies{

    }
}

subprojects{
    apply(plugin = "org.jetbrains.kotlin.jvm");
    apply(plugin = "org.jetbrains.kotlin.plugin.spring");
    apply(plugin = "org.springframework.boot");
    apply(plugin = "io.spring.dependency-management");

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs += "-Xjsr305=strict"
            jvmTarget = "17"
        }
    }
}

project(":api:account-api"){
    dependencies{
        implementation(project(":domain:member"))
    }
}
