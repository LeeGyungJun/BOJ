package com.augustin26.boj
//팩토리얼5
fun main() {
    val sb = StringBuilder()
    val n = readLine()!!.toInt()
    var start: Long = 1
    var result: Long = 1
    val mod = 1000000000000L
    while (start <= n) {
        result *= start
        while (true) {
            result /= if (result % 10 == 0L) 10 else break
        }
        start++
        result %= mod
    }
    var count = 0
    var temp = (result % 100000).toInt()
    while (true) {
        count++
        temp /= 10
        if (temp == 0) break
    }
    for (i in count..4) {
        sb.append(0)
    }
    sb.append(result % 100000)
    println(sb.toString())
}