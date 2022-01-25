package com.augustin26.boj

//참가자 명단
import java.io.BufferedReader
import java.io.InputStreamReader

fun main()=with(BufferedReader(InputStreamReader(System.`in`))) {
    val (a,b) = readLine()!!.split(" ").map { it.toInt() }
    val arr = IntArray(a+1) {0}
    val red = mutableListOf<Stude>()
    val blue = mutableListOf<Stude>()
    while (true) {
        val (x,y) = readLine()!!.split(" ")
        if (x=="0" && y=="0") break
        if (arr[x.toInt()]!=b) {
            arr[x.toInt()]++
            if (x.toInt()%2==0) red.add(Stude(x.toInt(),y))
            else blue.add(Stude(x.toInt(),y))
        }
    }
    var result = blue.sortedWith(compareBy({it.clas},{it.name.length},{it.name}))
    result.forEach { println("${it.clas} ${it.name}") }
    result = red.sortedWith(compareBy({it.clas},{it.name.length},{it.name}))
    result.forEach { println("${it.clas} ${it.name}") }

}

class Stude(
    val clas: Int,
    val name: String
)