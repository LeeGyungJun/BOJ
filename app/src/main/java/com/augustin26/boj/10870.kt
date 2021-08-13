package com.augustin26.boj

//배열을 이용한 피보나치 수열
import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val n = readLine().toInt()
    val fibo = IntArray(n+1)

    for(i in fibo.indices) {
        if(i==0) fibo[0] = 0
        else if(i==1) fibo[i] = 1
        else fibo[i] = fibo[i-1]+fibo[i-2]
    }
    print(fibo[n])
}