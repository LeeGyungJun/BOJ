package com.augustin26.boj

//쉽게 푸는 문제
fun main() {
    val (a,b) = readLine()!!.split(' ')
    val arr = mutableListOf<Int>()
    var result = 0
    loop@ for (i in 1..b.toInt()) {
        for(j in 1..i) {
            if (arr.size>b.toInt()) break@loop
            arr.add(i)
        }
    }
    for (j in a.toInt()-1 until b.toInt()) {
        result+=arr[j]
    }
    print(result)
}