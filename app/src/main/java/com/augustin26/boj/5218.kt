package com.augustin26.boj

//알파벳 거리
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(a: Array<String>)=with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    repeat(readLine()!!.toInt()) {
        val (a,b) = readLine()!!.split(" ")
        val list = mutableListOf<Int>()
        for (i in a.indices) {
            val n = b[i].code-a[i].code
            if (n>0) {
                list.add(n)
            }else if (n<0) {
                list.add(n+26)
            }else list.add(0)
        }
        bw.append("Distances: ")
        list.forEach { bw.append("$it ") }
        bw.append("\n")
        bw.flush()
    }
    bw.close()
}