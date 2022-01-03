package com.augustin26.boj

//ATM
fun main() {
    var result = 0
    readLine()
    val person = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    person.sort()
    for (i in person.indices) {
        var n = 0
        for (j in 0..i) {
            n+=person[j]
        }
        println(n)
        result+=n
    }
    print(result)
}