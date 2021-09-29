package com.augustin26.boj
//보물
import java.util.*

fun main() {
    val arr1 = mutableListOf<Int>()
    val arr2 = mutableListOf<Int>()
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    var result = 0
    for(i in 1..n) {
        arr1.add(sc.nextInt())
    }
    for(i in 1..n) {
        arr2.add(sc.nextInt())
    }
    arr1.sort()
    arr2.sortDescending()

    for(i in 0 until arr1.size) {
        result += arr1[i]*arr2[i]
    }
    print(result)
}