package com.augustin26.boj

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>)= with(BufferedReader(InputStreamReader(System.`in`))) {
    val str = readLine()!!
    var rs = 0
    str.forEach {
        rs+= when (it.code-'A'.code+1) {
            in 1..3->3
            in 4..6->4
            in 7..9->5
            in 10..12->6
            in 13..15->7
            in 16..19->8
            in 20..22->9
            in 23..26->10
            else -> 0
        }
    }
    print(rs)
}