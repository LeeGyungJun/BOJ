package com.augustin26.boj

//Project Teams
import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>)=with(BufferedReader(InputStreamReader(System.`in`))) {
    var n = readLine()!!.toInt()
    val stack = Stack<Int>()
    readLine()!!.split(" ").map { it.toInt() }.sortedDescending().forEach { stack.push(it) }
    n = stack.size/n
    val list = mutableListOf<Int>()
    var rs = 0
    var count = 1
    repeat(stack.size) {
        rs+=stack.pop()
        count++
        stack.reverse()
        if (count>n) {
            list.add(rs)
            rs=0
            count=1
        }
    }
    print(list.minOrNull())
}
