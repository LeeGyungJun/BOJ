package com.augustin26.boj

//피보나치 수의 확장
import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val n = readLine().toInt()
    val fibo = IntArray(2000003)

    if(n>=0) {
        for(i in 1000002..1000002+n) {
            if(i==1000002) fibo[i] = 0
            else if(i==1000003) fibo[i] = 1
            else fibo[i] = (fibo[i-1]+fibo[i-2])%1000000000
        }
    }else if(n<0) {
        for(i in 1000002 downTo 1000002+n) {
            if(i==1000002) {
                fibo[i] = 0
                fibo[i-1] = 1
                fibo[i-2] = (fibo[i]-fibo[i-1])%1000000000
            }
            else {
                fibo[i-2] = (fibo[i]-fibo[i-1])%1000000000
            }
        }
    }
    if (fibo[1000002 + n]<0) {
        println(-1)
        println(fibo[1000002 + n]*-1)
    }else if (fibo[1000002 + n]>0){
        println(1)
        println(fibo[1000002 + n])
    }else {
        println(0)
        println(0)
    }
}
