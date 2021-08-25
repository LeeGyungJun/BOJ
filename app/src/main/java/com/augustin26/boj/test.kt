package com.augustin26.boj

import java.util.Scanner
import kotlin.math.pow

fun main() {
    val arr = readLine()!!.split(" ")
    var result = 0
    for(i in arr.indices) {
        result += z(arr[i])
    }
    print("${result%10}")
}
fun z(s:String) : Int {
    return Math.pow(s.toDouble(),2.0).toInt()
}