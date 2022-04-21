package com.augustin26.boj

//대충 더해
import java.io.BufferedReader
import java.io.InputStreamReader

fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    val (a,b) = readLine()!!.split(" ").map { it.toMutableList() }
    if (a.size<b.size) while (a.size!=b.size) a.add(0,'0')
    else while (a.size!=b.size) b.add(0,'0')
    a.forEachIndexed { index, c ->
        print("${c.toString().toInt()+b[index].toString().toInt()}")
    }
}