package com.augustin26.boj

//데칼코마니
import java.io.BufferedReader
import java.io.InputStreamReader

fun main()=with(BufferedReader(InputStreamReader(System.`in`))) {
    val (y,x) = readLine()!!.split(" ").map { it.toInt() }
    repeat(y) {
        val str = readLine()!!
        var front = 0
        var back = x-1
        var rs = ""
        repeat(x/2) {
            if (str[front]=='.' && str[back]!=',') {
                rs+=str[back]
            }else if (str[front]!='.' && str[back]=='.') {
                rs+=str[front]
            }else {
                rs+='.'
            }
            front++
            back--
        }
        println("$rs${rs.reversed()}")
    }
}