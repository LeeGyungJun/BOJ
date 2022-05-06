package com.augustin26.boj

//소가 길을 건너간 이유 3
import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>)=with(BufferedReader(InputStreamReader(System.`in`))){
    val cows = mutableListOf<String>()
    repeat(readLine()!!.toInt()) { cows.add(readLine()!!) }
    val rs = cows.sortedWith(compareBy { it.split(" ")[0].toString().toInt() })
    var time = rs[0].split(" ").map { it.toString().toInt() }.toIntArray().sum()
    rs.drop(1).forEachIndexed { index, s ->
        val (a,b) = s.split(" ").map { it.toInt() }
        if (time<a) {
            time = a+b
        }else {
            time += b
        }
    }
    print(time)
}