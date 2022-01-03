package com.augustin26.boj

//칠무해
import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val list = mutableListOf<Float>()
    repeat(br.readLine()!!.toInt()) {
        list.add(br.readLine()!!.toFloat())
    }
    repeat(7) {
        println(String.format("%.3f",list.minOrNull()))
        list.remove(list.minOrNull())
    }
}