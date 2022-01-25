package com.augustin26.boj

//부분 문자열
import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val parent = readLine()!!
    val pattern = readLine()!!
    print(if (kmp(parent, pattern)) 1 else 0)
}

private fun kmp(parent: String, pattern: String) : Boolean {
    var result = false
    val table = makeTable(pattern)
    val parents = parent.toCharArray()
    val patterns = pattern.toCharArray()
    var k = 0
    for (i in parents.indices) {
        while (k > 0 && parents[i] != patterns[k]) {
            k = table[k - 1]
        }
        if (parents[i] == patterns[k]) {
            if (k == patterns.size - 1) {
                result = true
                return result
            } else {
                k++
            }
        }
    }
    return result
}

private fun makeTable(pattern: String): IntArray {
    val patterns = pattern.toCharArray()
    val table = IntArray(patterns.size)
    var k = 0
    for (i in 1 until patterns.size) {
        while (k > 0 && patterns[i] != patterns[k]) {
            k = table[k - 1]
        }
        if (patterns[i] == patterns[k]) {
            table[i] = ++k
        }
    }
    return table
}