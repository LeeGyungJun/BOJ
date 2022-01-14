package com.augustin26.boj

//괄호 끼워넣기
import java.util.*

fun main() {
    val stack = Stack<Char>()
    var rs = 0
    readLine()!!.forEach {
        if (it=='(') {
            stack.push(it)
        }else if (it==')') {
            if (stack.size>0) stack.pop()
            else rs++
        }
    }
    print(stack.size+rs)
}