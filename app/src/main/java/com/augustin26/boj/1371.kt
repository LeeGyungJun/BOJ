package com.augustin26.boj

//가장 많은 글자
import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>)=with(BufferedReader(InputStreamReader(System.`in`))) {
    val sb = StringBuilder()
    val alpha = mutableListOf<Int>()
    while(true) { //eof
        val s : String = readLine() ?: break
        sb.append(s)
    }
    for (i in 'a'.code..'z'.code) {
        alpha.add(sb.count { it==i.toChar() })
    }
    val max = alpha.maxOrNull()
    alpha.forEachIndexed { index, i ->
        if (i==max) print((index+97).toChar())
    }
}