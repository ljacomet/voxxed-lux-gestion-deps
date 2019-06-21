plugins {
    `java-library`
    `maven-publish`
}

group = "my.company"
version = "1.1.5"

repositories {
    jcenter()
}

dependencies {
    implementation("com.google.guava:guava:24.1.1-jre")

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
