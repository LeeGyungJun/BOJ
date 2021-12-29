package com.augustin26.boj

//뒤집힌 덧셈
fun main() {
    val (a,b) = readLine()!!.split(" ")
    print((a.reversed().toInt()+b.reversed().toInt()).toString().reversed().toInt())
}