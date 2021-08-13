package com.augustin26.boj

//더하기 사이클
import java.util.Scanner

fun main() {

    val sc = Scanner(System.`in`)
    var N = sc.nextInt()
    var copy = N
    var count = 0

    while(true){
        N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10)
        count++
        if(copy == N) {
            break
        }
    }
    print(count)
}