package com.augustin26.boj
//동일한 단어 그룹화하기
fun main() {
    val s = mutableSetOf<List<Char>>()
    repeat(readLine()!!.toInt()) {
        val str = readLine()!!.toList().sorted()
        s.add(str)
    }
    print(s.size)
}