package org.example


fun main() {
    // safe call operator
    val text: String? = null
    text?.length

    // elvis operator
    val nullText: String? = null
    val textLength = nullText?.length ?: 7
    val nextTextLength = nullText!!.length
}
/*
    output:

 */