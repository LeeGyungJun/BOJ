package com.augustin26.boj
//중복 빼고 정렬하기
import java.lang.StringBuilder

fun main() {
    var sb = StringBuilder()
    readLine()
    readLine()!!.split(" ").map { it.toInt() }.toSortedSet().forEach { sb.append("$it ") }
    print(sb.trim())
}