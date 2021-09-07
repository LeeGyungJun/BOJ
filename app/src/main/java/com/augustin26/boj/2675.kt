package com.augustin26.boj
//문자열 반복
import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() {
    val bw= BufferedWriter(OutputStreamWriter(System.`out`))
    repeat(readLine()!!.toInt()) {
        val (a,b) = readLine()!!.split(" ")
        b.forEach { it1->
            repeat(a.toInt()) {
                bw.write("$it1")
            }
        }
        bw.write("\n")
    }
    bw.flush()
    bw.close()
}