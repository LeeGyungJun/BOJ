package com.augustin26.boj

//시리얼 번호
import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.Comparator

fun main(args: Array<String>)= with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine()!!.toInt()
    val str = arrayOfNulls<String>(n)
    repeat(n) {
        str[it] = readLine()
    }
    Arrays.sort(str, Comparator { s1, s2 ->
        if (s1!!.length == s2!!.length) {
            var sum1 = 0
            var sum2 = 0
            for (i in s1.indices) {
                if (s1[i] - 'A' < 0) sum1 += s1[i] - '0'
                if (s2[i] - 'A' < 0) sum2 += s2[i] - '0'
            }
            return@Comparator if (sum1 == sum2) s1.compareTo(s2) else sum1.compareTo(sum2)
        }
        s1.length.compareTo(s2.length)
    })
    str.forEach { println(it) }
}
