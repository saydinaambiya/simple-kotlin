package org.example

fun main() {
    // indexing
    val firstText = "android"
    val fourthCharacter = firstText[3]
    println("The 4th character of the $firstText is $fourthCharacter")

    val secondText = "kotlin"
    for (character in secondText) {
        print("$character ")
    }

    // escaped
    val statement = "Kotlin is \"Awesome!\""
    val symbol = "Unicode test: \u00A9"
    println(statement)
    println(symbol)

    // raw
    val line = """
        Line 1
        Line 2
        Line 3
    """.trimIndent()
    print(line)
}

/*
    [output]
    -- indexing --
    The 4th character of the android is r
    k o t l i n

    -- escaped --
    Kotlin is "Awesome!"
    Unicode test: ©

    -- raw --
    Line 1
    Line 2
    Line 3

    [explain]
    -- escaped --
    \t = tab
    \n = new line
    \' = single quote
    \" = double quote
    \\ = backslash
 */