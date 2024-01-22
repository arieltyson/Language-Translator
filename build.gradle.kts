plugins {
  java
}

tasks.named<Jar>("jar") {
  manifest {
    attributes["Main-Class"] = "com.arieljtyson.languagetranslator.SayHello"
  }
}

repositories {
  mavenCentral()
}

dependencies {
  testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
}

sourceSets {
    main {
        java {
            srcDirs = ['src/main/java', 'src/test/java']
        }
    }
}