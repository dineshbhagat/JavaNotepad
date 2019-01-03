/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java project to get you started.
 * For more details take a look at the Java Quickstart chapter in the Gradle
 * user guide available at https://docs.gradle.org/5.0/userguide/tutorial_java_projects.html
 */

plugins {
    // Apply the java plugin to add support for Java
    java
    idea
    jdepend
    `project-report`
 //   pmd
    // Apply the application plugin to add support for building an application
    application
}

repositories {
    // Use jcenter for resolving your dependencies.
    // You can declare any Maven/Ivy/file repository here.
//    maven(url = "http://jcenter.bintray.com/")
//    maven(url = "http://central.maven.org/maven2/")
    mavenCentral()
    jcenter()
}

dependencies {
    // This dependency is found on compile classpath of this component and consumers.


    // remote connections
// https://mvnrepository.com/artifact/org.apache.httpcomponents/httpclient
    implementation("org.apache.httpcomponents:httpclient:4.5.6")


    compileOnly("org.projectlombok:lombok:1.18.4")
    annotationProcessor("org.projectlombok:lombok:1.18.4")

    // async library
    implementation("io.reactivex.rxjava2:rxjava:2.2.0")


    //json processing
    implementation("com.fasterxml.jackson.core:jackson-core:2.9.8")
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.9.8")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.9.8")


    // commons collections
    implementation("org.apache.commons:commons-collections4:4.2")
    implementation("com.google.guava:guava:27.0.1-jre")
    implementation("org.apache.commons:commons-lang3:3.8.1")

    // time lib
    implementation("joda-time:joda-time:2.10.1")

    
    // logging
    implementation("org.slf4j:slf4j-api:1.7.25")
    implementation("org.slf4j:slf4j-jdk14:1.7.25")

    //Base 64 lib
    implementation("commons-codec:commons-codec:1.11")


    // hystrix
    implementation("com.netflix.hystrix:hystrix-core:1.5.18")
    implementation("com.netflix.hystrix:hystrix-javanica:1.5.18")
    implementation("com.netflix.hystrix:hystrix-examples:1.5.18")



    // byte code manipulation
    implementation("org.javassist:javassist:3.24.0-GA")
    
    // ref: https://docs.gradle.org/current/userguide/java_testing.html#compiling_and_executing_junit_jupiter_tests
    // Use JUnit test framework
    // JUnit 5 = JUnit Platform + JUnit Jupiter + JUnit Vintage
    // JUnit 5 is the latest version of the well-known JUnit test framework. Unlike its predecessor, JUnit 5 is modularized and composed of several modules:
    // The JUnit Platform serves as a foundation for launching testing frameworks on the JVM.
    // JUnit Jupiter is the combination of the new programming model and extension model
    // for writing tests and extensions in JUnit 5. JUnit Vintage provides a TestEngine for
    // running JUnit 3 and JUnit 4 based tests on the platform.
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.3.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.3.2")

    // If you want to run JUnit 3/4 tests on JUnit Platform,
    // or even mix them with Jupiter tests, you should add extra JUnit Vintage Engine dependencies
    testCompile("junit:junit:4.12")
    testRuntimeOnly("org.junit.vintage:junit-vintage-engine:5.3.2")
}


application {
    // Define the main class for the application
    mainClassName = "com.dkb.App"
}
