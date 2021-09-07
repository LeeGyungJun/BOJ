package com.augustin26.boj
//첫 글자를 대문자로

fun main() {
    val sb = StringBuffer()
    repeat(readLine()!!.toInt()) {
        val arr = readLine()!!.split(" ")
        arr.forEach{
            if (it!="and" && it!="of") {
                for (i in it.indices) {
                    if (i==0) sb.append(it[i].uppercase()) else sb.append(it[i])
                }
                sb.append(" ")
            } else {
                sb.append("$it ")
            }
        }
        sb.append("\n")
    }
    print(sb)
}