package com.augustin26.boj
//문자열 폭발
import java.util.*

fun main() {
    val str1 = readLine()!!
    val str2 = readLine()!!
    val stack = Stack<Char>()
    val sb = StringBuilder()

    for (i in 0 until str1.length) {
        stack.push(str1[i])
        if (stack.size >= str2.length) {
            var flag = true
            for (j in str2.indices) {
                if (stack[stack.size - str2.length + j] != str2[j]) {
                    flag = false
                    break
                }
            }
            if (flag) {
                for (j in str2.indices) {
                    stack.pop()
                }
            }
        }
    }
    stack.forEach{
        sb.append(it)
    }
    println(if (sb.isEmpty()) "FRULA" else sb.toString())
}