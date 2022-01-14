package com.augustin26.boj

//나는야 포켓몬 마스터 이다솜
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>)= with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (a,b) = readLine()!!.split(" ").map { it.toInt() }
    val name = HashMap<Int, String>()
    val num = HashMap<String, Int>()
    repeat(a) {
        val str = readLine()!!
        name.put(it+1, str)
        num.put(str, it+1)
    }
    repeat(b) {
        val str = readLine()!!
        if (str.first().code-'0'.code<10) {
            bw.append("${name[str.toInt()]}\n")
        }else{
            bw.append("${num[str]}\n")
        }
    }
    bw.flush()
    bw.close()
}