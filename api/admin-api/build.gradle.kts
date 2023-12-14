import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "3.2.0"
	kotlin("plugin.spring") version "1.9.20"
	id("io.spring.dependency-management") version "1.1.4"
	kotlin("jvm") version "1.9.20"
}

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	testImplementation("org.springframework.boot:spring-boot-starter-test")


	implementation(project(":domain:member"))
	implementation(project(":util:crypto"))
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs += "-Xjsr305=strict"
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}