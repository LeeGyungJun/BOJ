package com.augustin26.boj

//좋은 단어
import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main(a: Array<String>)=with(BufferedReader(InputStreamReader(System.`in`))) {
    var result = 0
    repeat(readLine()!!.toInt()) {
        val st = readLine()!!
        val stack = Stack<Char>()
        var j = 0
        while (j < st.length) {
            if (!stack.isEmpty() && stack.peek() == st[j]) stack.pop()
            else stack.push(st[j])
            j++
        }
        if (stack.size == 0) result++
    }
    print(result)
}