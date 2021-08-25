package com.augustin26.boj
//에라토스테넷의 체
fun main() {
    val (n,k) = readLine()!!.split(" ").map{it.toInt()}
    val arr = mutableListOf<Int>()
    for(i in 2..n) arr.add(i)
    var x = 2
    var z = 0
    while (true) {
        var y = 0
        while (true) {
            if(z==k) {
                print(x*y)
                break
            }
            y++
            if(arr.last()<x*y) break
            if(arr.remove(x*y)) z++
        }
        if(z==k) break
        x++
    }
}