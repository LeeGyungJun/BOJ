package com.augustin26.boj

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val arr = mutableListOf<P>()
    repeat(readLine().toInt()) {
        val str = readLine().split(" ")
        arr.add(P(str[0], str[1].toInt(), str[2].toInt(), str[3].toInt()))
    }
    arr.sortWith(compareBy({it.year},{it.mon},{it.day}))
    print("${arr[arr.lastIndex].name}\n${arr[0].name}")
}

data class P(val name:String, val day:Int, val mon:Int, val year:Int)