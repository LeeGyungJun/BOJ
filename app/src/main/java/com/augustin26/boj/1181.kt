package com.augustin26.boj

//단어 정렬 (2가지 기준)
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw= BufferedWriter(OutputStreamWriter(System.`out`))
    var strArray = mutableListOf<String>()
    repeat(readLine().toInt()) {
        val str = readLine()
        if (!strArray.contains(str)) strArray.add(str)
    }
    strArray.sortWith(compareBy({it.length},{it}))
    strArray.forEach {
        bw.append("$it\n")
    }
    bw.flush()
    bw.close()
}