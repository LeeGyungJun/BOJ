package com.augustin26.boj

//배열 합치기
import java.lang.StringBuilder
import java.util.*

fun main() = with(Scanner(System.`in`)){
    val sb = StringBuilder()
    val (a,b) = readLine()!!.split(" ")
    val arr1 = IntArray(a.toInt())
    val arr2 = IntArray(b.toInt())
    for(i in 0 until a.toInt()) {
        arr1[i] = nextInt()
    }
    for(i in 0 until b.toInt()) {
        arr2[i] = nextInt()
    }
    val arr3 = (arr1+arr2).sortedArray()
    arr3.forEach {
        sb.append("$it ")
    }
    print(sb)
}