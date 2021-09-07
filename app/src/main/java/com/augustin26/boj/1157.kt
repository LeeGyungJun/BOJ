package com.augustin26.boj
//단어 공부
import java.util.*

fun main() {
    val str = readLine()!!.uppercase(Locale.getDefault())
    val set = str.toSet().toCharArray()
    var n = IntArray(set.size)
    str.forEach {
        for (i in set.indices) {
            if (it==set[i]) n[i]++
        }
    }
    val max = n.maxOrNull()
    val index = n.indexOf(max!!)
    val arr = n.toMutableList()
    arr.removeAt(index)
    if (arr.contains(max)) print("?") else print(set[index])
}
