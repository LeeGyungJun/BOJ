package com.augustin26.boj
//괄호
import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val bw= BufferedWriter(OutputStreamWriter(System.`out`))
    repeat(readLine()!!.toInt()) {
        val st = Stack<Int>()
        val str = readLine()!!
        loop@while (true) {
            for (i in str.indices) {
                when (str[i]) {
                    '(' -> st.push(1)
                    ')' -> if (st.size==0) {
                        bw.append("NO\n")
                        break@loop
                    } else {
                        st.pop()
                    }
                }
            }
            bw.append(if (st.size==0) "YES\n" else "NO\n")
            break
        }
    }
    bw.flush()
    bw.close()
}