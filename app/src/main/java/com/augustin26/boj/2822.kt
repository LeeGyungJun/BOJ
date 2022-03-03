package com.augustin26.boj

//점수 계산
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>)= with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var list = mutableListOf<Int>()
    val map = mutableMapOf<Int, Int>()
    val result = IntArray(5)
    var rs = 0
    repeat(8) {
        val n = readLine()!!.toInt()
        list.add(n)
        map[n] = it
    }
    list.sortDescending()
    for (i in 0..4) {
        rs += list[i]
        result[i] = map[list[i]]!! + 1
    }
    bw.append("$rs\n")
    result.sorted().forEach {
        bw.append("$it ")
    }
    bw.close()
}
