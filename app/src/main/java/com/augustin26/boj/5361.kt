package com.augustin26.boj
//전투 드로이드 가격
import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.text.DecimalFormat

fun main() {
    val bw= BufferedWriter(OutputStreamWriter(System.`out`))
    val dec = DecimalFormat("#.00")
    val arr = doubleArrayOf(350.34, 230.90, 190.55, 125.30, 180.90)
    repeat(readLine()!!.toInt()) {
        val spec = readLine()!!.split(" ").map { it.toDouble() }
        var result = 0.0
        for (i in 0..4) result += arr[i]*spec[i]
        bw.write("$${dec.format(result)}\n")
    }
    bw.flush()
    bw.close()
}