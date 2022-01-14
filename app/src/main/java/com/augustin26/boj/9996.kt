package com.augustin26.boj

//한국이 그리울 땐 서버에 접속하지
import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine()!!.toInt()
    val (a,b) = readLine()!!.split("*")
    repeat(n) {
        val str = readLine()!!
        if (str.length>=a.length+b.length) {
            bw.append(if (str.substring(0,a.length) == a && str.substring(str.length-b.length, str.length) == b) "DA\n" else "NE\n")
        }else {
            bw.append("NE\n")
        }

    }
    bw.flush()
    bw.close()
}