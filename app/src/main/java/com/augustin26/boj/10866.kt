package com.augustin26.boj
//덱
import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val bw= BufferedWriter(OutputStreamWriter(System.`out`))
    var dq = ArrayDeque<String>()
    repeat(readLine()!!.toInt()) {
        val arr = readLine()!!.split(' ')
        when (arr[0]) {
            "push_front" -> dq.addFirst(arr[1])
            "push_back" -> dq.addLast(arr[1])
            "pop_front" -> bw.append(if (dq.size>0) "${dq.pollFirst()}\n" else "-1\n")
            "pop_back" -> bw.append(if (dq.size>0) "${dq.pollLast()}\n" else "-1\n")
            "size" -> bw.append("${dq.size}\n")
            "empty" -> bw.append(if (dq.size>0) "0\n" else "1\n")
            "front" -> bw.append(if (dq.size>0) "${dq.first()}\n" else "-1\n")
            "back" -> bw.append(if (dq.size>0) "${dq.last()}\n" else "-1\n")
        }
    }
    bw.flush()
    bw.close()
}