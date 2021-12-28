package com.augustin26.boj

//팰린드롬
fun main() {
    val result = mutableListOf<String>()
    repeat(readLine()!!.toInt()) {
        val list = mutableListOf<String>()
        var str = ""
        repeat(readLine()!!.toInt()) {
            list.add(readLine()!!)
        }
        for (i in list.indices) {
            for (j in list.indices) {
                if (i!=j) {
                    str = list[i].plus(list[j])
                    if (str==str.reversed()) {
                        result.add(str)
                        return@repeat
                    }
                }
            }
        }
        result.add("0")
    }
    result.forEach {
        println(it)
    }
}