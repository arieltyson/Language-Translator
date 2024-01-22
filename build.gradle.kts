plugins {
  java
}

tasks.named<Jar>("jar") {
  manifest {
    attributes["Main-Class"] = "com.arieljtyson.languagetranslator.SayHello"
  }
}