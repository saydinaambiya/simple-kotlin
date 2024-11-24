package org.example


fun main() {
    val resultSum = sumNumbers(1, 2, 3)
    print(resultSum)
    val resultTechAndLang = setTechAndLang("backend", "java, kotlin")
    print(resultTechAndLang)

    // the difference array and vararg
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    sumNumbers(*numbers) // can use spread separator
}

fun sumNumbers(vararg numbers: Int): Int { // vararg is array
    return numbers.sum()
}

fun setTechAndLang(tech: String, vararg lang: String): String { // best practice is set the vararg at last parameters
    return "You can learn $tech using ${lang.toList()}"
}
/*
    output:
    6
 */