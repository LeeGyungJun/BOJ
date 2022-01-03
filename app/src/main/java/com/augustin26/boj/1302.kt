package com.augustin26.boj

//베스트셀러
import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val set= mutableSetOf<String>()
    val list = mutableListOf<Int>()
    val n = br.readLine().toInt()
    if (n==1) {
        print(br.readLine()!!)
    }else{
        repeat(n) {
            val str = br.readLine()!!
            if (!set.contains(str)) {
                set.add(str)
                list.add(0)
            }
            list[set.indexOf(str)]++
        }
        val max = list.maxOrNull()
        val result = mutableSetOf<String>()
        for (i in list.indices) {
            if (list[i]==max) {
                result.add(set.toList()[i])
            }
        }
        print(result.toList().sorted()[0])
    }
}