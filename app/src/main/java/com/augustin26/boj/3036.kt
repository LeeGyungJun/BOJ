package com.augustin26.boj
//링
import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val i = sc.nextInt()
    var arr = mutableListOf<Int>()
    for(x in 0 until i){
        var t = sc.nextInt()
        arr.add(t)
    }
    for(x in 1 until i){
        var gcd = gcd(arr[0],arr[x])
        println("${arr[0]/gcd}/${arr[x]/gcd}")
    }
}
fun gcd(a: Int, b: Int): Int {
    var maximum = a.coerceAtLeast(b)
    var minimum = a.coerceAtMost(b)

    if (minimum == 0) {
        return maximum
    } else {
        return gcd(minimum, maximum % minimum)
    }
}