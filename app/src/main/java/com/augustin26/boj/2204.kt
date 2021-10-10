package com.augustin26.boj
//도비의 난독증 테스트
import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() {
    val bw= BufferedWriter(OutputStreamWriter(System.`out`))
    while (true) {
        val arr = mutableListOf<String>()
        val map = mutableMapOf<String, String>()
        val n = readLine()!!.toInt()
        if (n==0) break
        repeat(n) {
            val str = readLine()!!
            arr.add(str.lowercase())
            map[str.lowercase()] = str
        }
        arr.sort()
        bw.append("${map[arr[0]]}\n")
    }
    bw.flush()
    bw.close()
}