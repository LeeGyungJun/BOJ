package com.augustin26.boj
//스택
import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val bw= BufferedWriter(OutputStreamWriter(System.`out`))
    val st = Stack<String>()
    repeat(readLine()!!.toInt()) {
        val arr = readLine()!!.split(' ')
        when (arr[0]) {
            "push" -> st.push(arr[1])
            "pop" -> bw.append(if (st.size>0) "${st.pop()}\n" else "-1\n")
            "size" -> bw.append("${st.size}\n")
            "empty" -> bw.append(if (st.size>0) "0\n" else "1\n")
            "top" -> bw.append(if (st.size>0) "${st.last()}\n" else "-1\n")
        }
    }
    bw.flush()
    bw.close()
}