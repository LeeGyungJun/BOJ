package com.augustin26.boj

//오큰수
import java.util.Stack

fun main() {
    val size = readLine()!!.toInt()
    val list = readLine()!!.split(" ").map { it.toInt() }
    val stack = Stack<Int>()
    val result = Array(size) { -1 }

    for (i in list.indices) {
        val num = list[i]
        while (stack.isNotEmpty() && list[stack.peek()] < num) {
            result[stack.pop()] = num
        }
        stack.push(i)
    }

    print(result.joinToString(" "))
}