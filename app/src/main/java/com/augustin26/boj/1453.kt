package com.augustin26.boj
//피시방 알바
fun main() {
    readLine()
    val arr = readLine()!!.split(" ")
    print("${arr.size-arr.toSet().size}")
}