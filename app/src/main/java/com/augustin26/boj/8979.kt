package com.augustin26.boj

//올림픽
import java.io.BufferedReader
import java.io.InputStreamReader

fun main()= with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, found) = readLine()!!.split(" ")
    val list = mutableListOf<List<Long>>()
    var temp:Long = 0
    var rank = 0
    var stop = 0
    repeat(n.toInt()) {
        val t = readLine()!!.split(" ").map { it.toLong() }
        val t2 = mutableListOf<Long>(t[0],t[1]*100000000000000L+t[2]*10000000L+t[3])
        list.add(t2)
    }
    list.sortWith(compareByDescending { it[1] })
    list.forEach {
        if (it[1]==temp) stop++
        else if (stop==0) rank++
        else rank+=stop
        temp = it[1]
        if (it[0]==found.toLong()) {
            print(rank)
            return@forEach
        }
    }
}