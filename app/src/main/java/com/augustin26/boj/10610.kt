package com.augustin26.boj

//30
import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main()=with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine()!!
    val s = 3
    if (!n.contains('0')) {
        print(-1)
    }else if (n.toBigInteger().mod(s.toBigInteger())!=0.toBigInteger()) {
        print(-1)
    }else {
        val result = n.toCharArray()
        Arrays.sort(result)
        for (i in result.size-1 downTo 0) print(result[i])
    }
}