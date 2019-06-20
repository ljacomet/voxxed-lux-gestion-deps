
plugins {
    `java-library`
}

repositories {
    jcenter()
}

dependencies {
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.8.9")
    implementation("io.vertx:vertx-core:3.5.3")

    testImplementation("junit:junit:4.12")
}
