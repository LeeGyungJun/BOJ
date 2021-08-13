package com.augustin26.boj

//좌표 정렬
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw= BufferedWriter(OutputStreamWriter(System.`out`))
    var arr = mutableListOf<List<String>>()
    repeat(readLine().toInt()) {
        val str: List<String> = readLine().split(" ")
        arr.add(str)
    }
    arr.sortWith(compareBy({it[0].toInt()},{it[1].toInt()}))
    arr.forEach {
        bw.append("${it[0]} ${it[1]}\n")
    }
    bw.flush()
    bw.close()
}
