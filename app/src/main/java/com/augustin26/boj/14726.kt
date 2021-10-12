package com.augustin26.boj
//신용카드 판별
fun main() {
    repeat(readLine()!!.toInt()) {
        val arr = mutableListOf<Int>()
        var num = 0
        readLine()!!.toString().forEach {
            num++
            if (num % 2 == 1) {
                if (it.toString().toInt() * 2>=10) {
                    val a = (it.toString().toInt() * 2).toString()
                    arr.add(a.get(0).toString().toInt() + a.get(1).toString().toInt())
                } else {
                    arr.add(it.toString().toInt() * 2)
                }
            } else {
                arr.add(it.toString().toInt())
            }
        }
        println(if (arr.sum()%10==0) "T" else "F")
    }
}
