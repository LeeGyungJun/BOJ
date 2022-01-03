package com.augustin26.boj

//회의실 배정
import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val num = br.readLine()!!.toInt()
    val arr = Array<IntArray>(num){IntArray(2)}
    repeat(num) {
        arr[it] = (br.readLine()!!.split(" ").map { it.toInt() }).toIntArray()
    }
    arr.sortWith{x,y->if(x[1]==y[1])x[0]-y[0]else x[1]-y[1]}
    var end = 0
    var answer = 0
    arr.forEach { item ->
        end = if(end <= item[0]) {
            answer ++
            item[1]
        }
        else end
    }
    print(answer)
    br.close()
}