package com.augustin26.boj

//접미사 배열
import java.io.BufferedReader
import java.io.InputStreamReader

fun main()=with(BufferedReader(InputStreamReader(System.`in`))) {
    var str = readLine()!!
    val list = mutableListOf<String>()
    repeat(str.length) {
        list.add(str)
        str = str.drop(1)
    }
    list.sorted().forEach { println(it) }
}