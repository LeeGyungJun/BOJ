package com.augustin26.boj
//가장 긴 단어
import java.lang.StringBuilder

fun main() {
    val sb = StringBuilder()
    var max = 0
    var result = ""
    while (true) {
        var str = readLine()!!
        if (str.contains("E-N-D")) {
            str = str.dropLast(5)
            sb.append(str)
            break
        }
        sb.append(str)
    }
    val st = sb.trim().split(" ")
    st.forEach {
        it.replace("[^a-zA-Z-]".toRegex(), " ").trim().split(" ").forEach {
            if (it.length>max) {
                max = it.length
                result = it
            }
        }
    }
    print(result.lowercase())
}