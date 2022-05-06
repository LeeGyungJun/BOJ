package com.augustin26.boj

//동전 0
import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>)=with(BufferedReader(InputStreamReader(System.`in`))) {
    val list = mutableListOf<Int>()
    var (a,b) = readLine()!!.split(" ").map { it.toInt() }
    var rs = 0
    repeat(a) {
        list.add(readLine()!!.toInt())
    }
    list.reversed().forEach {
        while (true) {
            if (b/it>0) {
                rs+=b/it
                b-=(b/it)*it
            }
            else break
        }
    }
    print(rs)
}