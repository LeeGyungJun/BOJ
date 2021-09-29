package com.augustin26.boj
//줄 세우기
fun main() {
    val arr = mutableListOf<String>()
    repeat(readLine()!!.toInt()){
        arr.add(readLine()!!)
    }

    val incre = arr.sorted()
    val decre = arr.sortedDescending()
    print(if (arr==incre) "INCREASING" else if (arr==decre) "DECREASING" else "NEITHER")
}