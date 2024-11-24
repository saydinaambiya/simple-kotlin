package org.example


fun main() {
    var stringValue: String? = "Kotlin"
    if (stringValue != null){ // in kotlin this called smart case
        println(stringValue)
    }

    var obj: Any? = "Kotlin"
    if (obj is String){
        // no need extra casting as explicit
        println("String length is ${obj.length}")
    }
}
/*
    output:
    Kotlin
    String length is 6
 */