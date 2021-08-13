package com.augustin26.boj

//피보나치 함수
import java.io.*

val dp = Array<IntArray>(41) { IntArray(2) }
val bw= BufferedWriter(OutputStreamWriter(System.`out`))
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    dp[0][0] = 1
    dp[0][1] = 0
    dp[1][0] = 0
    dp[1][1] = 1

    repeat(readLine().toInt()) {
        val n = readLine().toInt()
        fibonacci(n)
    }
    bw.flush()
    bw.close()
}

fun fibonacci(n: Int) {
    for (i in 2 .. n) {
        dp[i][0] = dp[i - 1][0] + dp[i - 2][0]
        dp[i][1] = dp[i - 1][1] + dp[i - 2][1]
    }

    bw.append("${dp[n][0]} ${dp[n][1]}\n")
}