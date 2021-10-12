package com.augustin26.boj
//아시아 정보올림피아드
fun main() {
    val arr = Array<IntArray>(readLine()!!.toInt()) { IntArray(3) }
    val country = mutableSetOf<Int>()
    arr.forEach {
        val t = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
        arr[arr.indexOf(it)] = t
        country.add(t[0])
    }
    val countryArr = IntArray(country.size)
    arr.sortWith(compareByDescending { it[2] })
    var medal = 0
    var i = 0
    while (true) {
        if (countryArr[country.indexOf(arr[i][0])]<2) {
            medal++
            countryArr[country.indexOf(arr[i][0])]++
            println("${arr[i][0]} ${arr[i][1]}")
        }
        i++
        if (medal==3) break
    }
}