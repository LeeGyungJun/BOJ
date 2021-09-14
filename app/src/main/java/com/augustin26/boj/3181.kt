package com.augustin26.boj
//줄임말 만들기
import java.lang.StringBuilder

fun main() {
    val arr = arrayOf("i", "pa", "te", "ni", "niti", "a", "ali", "nego", "no", "ili")
    val sb = StringBuilder()
    var n = 0
    readLine()!!.split(" ").forEach {
        n++
        if (n>1) {
            if (!arr.contains(it)) {
                sb.append(it[0].uppercase())
            }
        } else {
            sb.append(it[0].uppercase())
        }
    }
    print(sb)
}