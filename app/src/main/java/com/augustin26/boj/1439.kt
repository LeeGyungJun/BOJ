package com.augustin26.boj

//뒤집기
import java.io.BufferedReader
import java.io.InputStreamReader

fun main()= with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine()
    val a = n.replace("01","#").count { it=='#' }
    val b = n.replace("10","#").count { it=='#' }
    println(if (a<b) b else a)
}