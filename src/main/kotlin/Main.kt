package org.example

fun main() {
    val name = "Kotlin"

    print(if (name.isBlank()) "Hello World" else "Hello $name")
}

/*
    output:
    if name is Kotlin: "Hello Kotlin"
    if name is blank: "Hello World"
 */