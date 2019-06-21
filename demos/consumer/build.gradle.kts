
plugins {
    `java-library`
}

repositories {
    jcenter()
    maven {
        url = uri("$projectDir/../repo")
    }
}

dependencies {
    implementation("my.company:producer:1.0.0")

    // Use JUnit test framework
    testImplementation("junit:junit:4.12")
}
