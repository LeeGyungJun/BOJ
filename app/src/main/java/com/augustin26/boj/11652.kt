package com.augustin26.boj

//카드
import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.HashMap

fun main(args: Array<String>)= with(BufferedReader(InputStreamReader(System.`in`))) {
    val map = HashMap<Long, Int>()
    repeat(readLine()!!.toInt()) {
        val n = readLine()!!.toLong()
        if (map.containsKey(n)) {
            map[n] = map[n]!!+1
        }else {
            map[n] = 1
        }
    }
    val max = Collections.max(map.values)
    val result = mutableListOf<Long>()
    for ((key, value) in map) {
        if (value == max) {
            result.add(key)
        }
    }
    print(result.minOrNull())
}