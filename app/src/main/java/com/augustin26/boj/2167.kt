package com.augustin26.boj
//2차원 배열의 합
import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() {
    val bw= BufferedWriter(OutputStreamWriter(System.`out`))
    val (a,b) = readLine()!!.split(' ').map { it.toInt() }
    val arr = Array<IntArray>(a) { IntArray(b) }.map { readLine()!!.split(' ').map { it.toInt() }.toIntArray() }
    repeat(readLine()!!.toInt()) {
        var result = 0
        val (i,j,x,y) = readLine()!!.split(' ').map { it.toInt() }
        for (n in i-1 until x) {
            for (m in j-1 until y) {
                result+=arr[n][m]
            }
        }
        bw.append("$result\n")
    }
    bw.flush()
    bw.close()
}