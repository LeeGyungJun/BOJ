package com.augustin26.boj
//행렬 덧셈
import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val bw= BufferedWriter(OutputStreamWriter(System.`out`))
    val x = sc.nextInt()
    val y = sc.nextInt()
    var arr1 = Array<IntArray>(x) { IntArray(y) }
    var arr2 = Array<IntArray>(x) { IntArray(y) }
    var result = Array<IntArray>(x) { IntArray(y) }

    for(i in 0 until x) {
        for(j in 0 until y) {
            arr1[i][j] = sc.nextInt()
        }
    }
    for(i in 0 until x) {
        for(j in 0 until y) {
            arr2[i][j] = sc.nextInt()
        }
    }
    for(i in 0 until x) {
        for(j in 0 until y) {
            result[i][j] = arr1[i][j]+arr2[i][j]
        }
    }
    for(i in 0 until x) {
        for(j in 0 until y) {
            bw.write("${result[i][j]} ")
        }
        bw.write("\n")
    }
    bw.flush()
    bw.close()
}