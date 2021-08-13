package com.augustin26.boj
//최소 힙
import java.util.*
import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val heap = PriorityQueue<Int>()
    for(i in 0 until n) {
        val x = readLine().toInt()
        if(x==0){
            if(heap.isEmpty()) {
                println(0)
            }else{
                println(heap.poll())
            }
        }else{
            heap.add(x)
        }
    }
}