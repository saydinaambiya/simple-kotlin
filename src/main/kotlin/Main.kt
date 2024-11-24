package org.example


fun main() {
    greetingUser("Kotlin")
}

fun greetingUser(name: String) { // :Unit like void in Java
    println("Hello $name")
}


/*
    output:
    Hello Kotlin
 */