package com.augustin26.boj

//수 찾기
import java.lang.StringBuilder
import java.util.*

fun main() = with(Scanner(System.`in`)){
    val sb = StringBuilder()
    readLine()
    val arr1 = readLine()!!.split(" ").toSet()
    readLine()
    val arr2 = readLine()!!.split(" ")

    arr2.forEach{
        sb.append(if (arr1.contains(it)) "1\n" else "0\n")
    }
    print(sb)
}