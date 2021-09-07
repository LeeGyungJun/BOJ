package com.augustin26.boj
//큐
import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val bw= BufferedWriter(OutputStreamWriter(System.`out`))
    val que: Queue<String> = LinkedList<String>()
    repeat(readLine()!!.toInt()) {
        val arr = readLine()!!.split(' ')
        when (arr[0]) {
            "push" -> que.add(arr[1])
            "pop" -> bw.append(if (que.size>0) "${que.poll()}\n" else "-1\n")
            "size" -> bw.append("${que.size}\n")
            "empty" -> bw.append(if (que.size>0) "0\n" else "1\n")
            "front" -> bw.append(if (que.size>0) "${que.element()}\n" else "-1\n")
            "back" -> bw.append(if (que.size>0) "${que.last()}\n" else "-1\n")
        }
    }
    bw.flush()
    bw.close()
}