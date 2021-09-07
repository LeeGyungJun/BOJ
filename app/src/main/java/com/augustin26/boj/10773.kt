package com.augustin26.boj
//제로
import java.util.*

fun main() {
    val st = Stack<Int>()
    repeat(readLine()!!.toInt()) {
        val n = readLine()!!
        if (n=="0" && st.size>0) st.pop() else st.push(n.toInt())
    }
    print(st.sum())
}