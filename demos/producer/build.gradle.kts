plugins {
    `java-library`
    `maven-publish`
}

group = "my.company"
version = "1.3.0"

repositories {
    jcenter()
}

dependencies {
    implementation("com.google.guava:guava:27.0-jre")

    testImplementation("junit:junit:4.12")
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }
    repositories {
        maven {
            url = uri("$projectDir/../repo")
        }
    }
}
