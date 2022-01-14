package com.augustin26.boj

//단어 개수 세기
import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {
    val str = readLine()!!.split(" ","-")
    val result = mutableListOf<String>()
    str.forEach {
        var flag = false
        if (!it.contains("'")) {
            result.add(it)
            flag = true
        }
        else {
            val (a,b) = it.split("'")
            if (a=="c" || a=="j" || a=="n" || a=="m" || a=="t" || a=="s" || a=="l" || a=="d" || a=="qu") {
                flag = true
                result.add(a)
            }
            if (flag) if (b.first()=='a' || b.first()=='e' || b.first()=='i' || b.first()=='o' || b.first()=='u' || b.first()=='h') {
                result.add(b)
            }
        }
        if (!flag) result.add(it)
    }
    print(result.size)
}