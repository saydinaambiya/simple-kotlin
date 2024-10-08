package org.example

fun main() {
    var vocal = 'S'

    for (a in 1..5) {
        if (a >= 3) println(vocal--) else println(vocal++)
    }
}

/*
    [output]
    S
    T
    U
    T
    S

    [explain]
    char is representation of Unicode(e.g A equals 0041, B equals 0042)
 */