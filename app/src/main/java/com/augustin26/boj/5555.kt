package com.augustin26.boj

//반지
import java.io.BufferedReader
import java.io.InputStreamReader

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val str = readLine()!!
    val n = readLine()!!.toInt()
    var cnt = 0
    for (i in 0 until n) {
        var s = readLine()!!
        s += s
        if (s.contains(str)) cnt++
    }
    println(cnt)
}