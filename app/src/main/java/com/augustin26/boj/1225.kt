package com.augustin26.boj

//이상한 곱셈
fun main() {
    val (a,b) = readLine()!!.split(' ')
    var result:Long = 0
    a.forEach { a->
        b.forEach { b->
            result+= a.toString().toInt() * b.toString().toInt()
        }
    }
    print(result)
}