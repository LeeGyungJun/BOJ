package com.augustin26.boj

//한수
import java.io.BufferedReader
import java.io.InputStreamReader

fun main()=with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine()!!
    if (n.toInt() < 100) {
        print(n)
    }else {
        var rs = 99
        for (i in 100..n.toInt()) {
            val n1 = i.toString()[0].toString().toInt()
            val n2 = i.toString()[1].toString().toInt()
            val n3 = i.toString()[2].toString().toInt()
            if ((n2-n1)==(n3-n2)) rs++
        }
        print(rs)
    }
}