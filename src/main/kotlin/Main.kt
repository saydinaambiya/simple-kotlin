package org.example

fun main() {
    val name = "kotlin"
    val old = 3
    val hour = 7
    println("My name is $name, i am $old years old")
    print("Office ${if (hour > 7) "already close" else "is open"}")
}

/*
    [output]
    My name is kotlin, i am 3 years old
    Office is open
 */