package com.augustin26.boj

//방 번호
fun main() {
    val a = readLine()
    val arr = ArrayList<Int>()
    for (i in 1..10)
        arr.add(0)

    a!!.forEach {
        when(it) {
            '0' -> arr[0]++
            '1' -> arr[1]++
            '2' -> arr[2]++
            '3' -> arr[3]++
            '4' -> arr[4]++
            '5' -> arr[5]++
            '6' -> arr[6]++
            '7' -> arr[7]++
            '8' -> arr[8]++
            '9' -> arr[9]++
        }
    }

    if (arr.indexOf(arr.maxOrNull())==6) {
        while(arr[6] > arr[9]) {
            arr[6]--
            arr[9]++
        }
    }
    else if (arr.indexOf(arr.maxOrNull())==9) {
        while(arr[6] < arr[9]) {
            arr[9]--
            arr[6]++
        }
    }

    println(arr.maxOrNull())
}