package com.augustin26.boj

//찾기
import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>)=with(BufferedReader(InputStreamReader(System.`in`))){
    val parent = readLine()!!
    val pattern = readLine()!!
    var rs = kmp(parent, pattern)
    println(rs[0])
    rs.drop(1).forEach { print("$it ") }
}

private fun kmp(parent: String, pattern: String) : List<Int> {
    val list = mutableListOf<Int>()
    list.add(0)
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
                list[0]++
                list.add(i - patterns.size + 2)
                k = table[k]
            } else {
                k++
            }
        }
    }
    return list
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