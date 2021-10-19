package com.augustin26.boj
//세로읽기

fun main() {
    var arr = Array<Array<Char>>(5){Array<Char>(15){i -> ' ' } }.map { readLine()!!.toCharArray() }
    for (i in 0..14) {
        for (j in 0..4) {
            if (arr[j].size<=i) continue
            print(if (arr[j][i]==' ') "" else "${arr[j][i]}")
        }
    }
}