package com.augustin26.boj
//단어순서 뒤집기
import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() {
    val bw= BufferedWriter(OutputStreamWriter(System.`out`))
    for (i in 1..readLine()!!.toInt()) {
        val str = readLine()!!.split(" ")
        if (str.size!=1) {
            bw.append("Case #$i: ")
            for (i in str.size-1 downTo 0) {
                bw.append("${str[i]}")
                if (i!=0) bw.append(" ")
            }
            bw.append("\n")
        }else{
            bw.append("Case #$i: ${str[0]}\n")
        }
    }
    bw.flush()
    bw.close()
}