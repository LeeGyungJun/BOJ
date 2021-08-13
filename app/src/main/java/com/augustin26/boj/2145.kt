package com.augustin26.boj

//숫자 놀이
import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    while (true) {
        val n = sc.nextInt()
        if(n==0) {
            break
        }else{
            println(num(n))
        }
    }
}
fun num(i:Int):Int{
    var result = 0
    var str = i.toString()
    for (x in str.indices) {
        result += str[x].digitToInt()
    }
    return if (result/10>0) {
        num(result)
    }else{
        result
    }
}