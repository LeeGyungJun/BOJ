package com.augustin26.boj

//달팽이는 올라가고 싶다
fun main() {
    val (up,down,length) = readLine()!!.split(" ").map { it.toInt() }
    var day: Int = (length - down) / (up - down)
    if ((length - down) % (up - down) !== 0) {
        day++
    }
    println(day)
}