package com.augustin26.boj

//가운데를 말해요
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw= BufferedWriter(OutputStreamWriter(System.`out`))
    val min = PriorityQueue<Int>()
    val max = PriorityQueue<Int>(Collections.reverseOrder())
    repeat(readLine().toInt()) {
        val x = readLine().toInt()
        if(min.size == max.size) {
            max.add(x)
        }else{
            min.add(x)
        }
        if (!min.isEmpty() && !max.isEmpty() && min.peek() < max.peek()) {
            val temp = min.poll()
            min.add(max.poll())
            max.add(temp)
        }
        bw.write("${max.peek()}\n")
    }
    bw.flush()
    bw.close()
    close()
}