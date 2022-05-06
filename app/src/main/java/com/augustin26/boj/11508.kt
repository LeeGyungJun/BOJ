package com.augustin26.boj
//2+1 세일
import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>)=with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine()!!.toInt()
    val list = mutableListOf<Int>()
    val sum = mutableListOf<Int>()
    var rs = 0
    repeat(n) {
        list.add(readLine()!!.toInt())
    }
    list.sortedDescending().forEachIndexed { index, i ->
        sum.add(i)
        if (sum.size==3) {
            rs+=sum[0]+sum[1]
            sum.clear()
        }
    }
    rs+=sum.sum()
    print(rs)
}
