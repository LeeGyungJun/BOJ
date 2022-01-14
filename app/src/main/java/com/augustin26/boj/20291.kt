package com.augustin26.boj

//파일 정리
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>)=with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val map = mutableMapOf<String, Int>()
    repeat(readLine()!!.toInt()) {
        val t = readLine()!!.split(".")[1]
        if (map.containsKey(t)) map[t]?.plus(1)?.let { it1 -> map.put(t, it1) }
        else map.put(t,1)
    }
    map.toSortedMap().forEach { s, i -> bw.append("$s $i\n") }
    bw.flush()
    bw.close()
}