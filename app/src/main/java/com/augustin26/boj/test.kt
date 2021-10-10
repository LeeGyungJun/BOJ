package com.augustin26.boj

fun main() {
    repeat(readLine()!!.toInt()) {
        val str = readLine()!!
        val n = str.length
        println(if(str[n/2-1]==str[n/2]) "Do-it" else "Do-it-Not")
    }
}