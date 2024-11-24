package org.example


fun main() {
    val byteNumber: Byte = 10
    val intNumber: Int = byteNumber.toInt()
    println(intNumber)

    val stringNumber = "10"
    val stringToIntNumber: Int = stringNumber.toInt()
    println(stringToIntNumber)

    val readableNumber = 1_000
    println(readableNumber)
}

/*
    [output]
    10
    10
    1000
 */