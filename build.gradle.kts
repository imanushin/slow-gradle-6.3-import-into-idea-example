plugins {
    kotlin("jvm") version embeddedKotlinVersion
}

repositories {
    jcenter()

    maven {
        url = uri("http//link-to-internal-artifactory")
    }
}

dependencies {
    implementation(kotlin("stdlib"))
}