package com.augustin26.boj

//알파벳 개수
fun main() {
    val map = mutableMapOf<Int,Int>()
    for (i in 97..122) {
        map[i] = 0
    }
    readLine()!!.forEach {
        map[it.code]?.plus(1)?.let { it1 -> map[it.code] = it1 }
    }
    map.forEach{
        print("${it.value} ")
    }
}