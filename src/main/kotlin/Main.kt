package org.example

fun main() {
    var programmingLanguage: String? = null;
    val platform: String = "Android"

    if (platform == "Android") {
        programmingLanguage = "Kotlin"
    }
    println("$platform $programmingLanguage");

    // manipulation variables

    var value = 1
    value = value + 2

    // another war
    var anotherValue = 1
    anotherValue += 2

    println("value: $value and another value: $anotherValue");
}

/*
    [variable]
    var identifier: Type = initialization

    [output]
    Android Kotlin
    value: 3 and another value: 3
 */