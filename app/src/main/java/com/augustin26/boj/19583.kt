package com.augustin26.boj

//싸이버개강총회
import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (a,b,c) = br.readLine()!!.split(" ")
    val list = mutableSetOf<String>()
    val rs = mutableSetOf<String>()
    while(true) { //eof
        val s : String = br.readLine() ?: break
        val (time, name) = s.split(" ")
        if (time<=a) {
            list.add(name)
        }else if (time in b..c) {
            if (list.contains(name)) rs.add(name)
        }
    }
    print(rs.size)
}