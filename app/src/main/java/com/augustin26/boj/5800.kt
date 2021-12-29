package com.augustin26.boj

//성적 통계
fun main() {
    repeat(readLine()!!.toInt()) {
        var max = 0
        val list = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
        list.removeAt(0)
        list.sort()
        for (i in 0 until list.size-1) {
            if ((list[i+1]-list[i])>max) max= list[i+1]-list[i]
        }
        println("Class ${it+1}")
        println("Max ${list.last()}, Min ${list.first()}, Largest gap $max")
    }
}