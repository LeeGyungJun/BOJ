package com.augustin26.boj
//J박스
fun main(){
    val arr = Array(readLine()!!.toInt()){ readLine()!!.toInt()}
    arr.forEach {
        for (i in 0 until it) {
            for (j in 0 until it) {
                if (i==0 || i==it-1 || j==0 || j==it-1) print("#") else print("J")
            }
            println()
        }
        println()
    }
}
