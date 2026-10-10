package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    val numberRegex = "\\d+".toRegex()
    val matchResult = numberRegex.find(str)

    return if (matchResult != null) {
        val number = matchResult.value.toInt()
        val result = number * int
        str.replace(matchResult.value, result.toString())
    } else {
        str + int
    }
}
