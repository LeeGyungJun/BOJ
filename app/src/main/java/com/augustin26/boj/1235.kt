package com.augustin26.boj
//학생 번호
fun main() {
    val list = mutableListOf<String>()
    repeat(readLine()!!.toInt()) {
        list.add(readLine()!!)
    }
    for (i in 1..list[0].length) {
        val set = mutableSetOf<String>()
        list.forEach {
            set.add(it.substring(it.length-i))
        }
        println(set)
        if (set.size==list.size) {
            print(i)
            break
        }
    }
}