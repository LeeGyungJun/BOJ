package com.augustin26.boj
//나이순 정렬
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw= BufferedWriter(OutputStreamWriter(System.`out`))
    val arr = mutableListOf<Person10>()
    for(i in 1..readLine().toInt()) {
        val str = readLine().split(" ")
        arr.add(Person10(str[0].toInt(),str[1],i))
    }
    arr.sortWith(compareBy({it.age},{it.num}))
    arr.forEach {
        bw.append("${it.age} ${it.name}\n")
    }
    bw.flush()
    bw.close()
}

data class Person10(val age:Int, val name:String, val num:Int)