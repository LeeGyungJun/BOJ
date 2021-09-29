package com.augustin26.boj
//듣보잡
fun main() {
    val (a,b) = readLine()!!.split(" ").map { it.toInt() }
    val emebo = mutableSetOf<String>()
    val result = mutableListOf<String>()
    repeat(a) {
        emebo.add(readLine()!!)
    }
    repeat(b) {
        val st = readLine()!!
        if (emebo.contains(st)) result.add(st)
    }
    result.sort()
    println(result.size)
    result.forEach { println(it) }
}