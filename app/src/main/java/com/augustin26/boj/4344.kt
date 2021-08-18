package com.augustin26.boj

//평균은 넘겠지
import java.text.DecimalFormat
import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val dec = DecimalFormat("#.000")
    repeat(sc.nextInt()) {
        val arr = mutableListOf<Double>()
        var result:Double = 0.0
        var count:Double = 0.0
        repeat(sc.nextInt()) {
            val n = sc.nextDouble()
            result += n
            arr.add(n)
        }
        for(i in 0 until arr.size) {
            if(arr[i]>result/arr.size) count++
        }
        println("${dec.format((count/arr.size.toDouble())*100.0)}%")
    }
}