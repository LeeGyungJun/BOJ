package com.augustin26.boj

//회사에 있는 사람
fun main() {
    val map = HashMap<String, String>()
    repeat(readLine()!!.toInt()) {
        val (a,b) = readLine()!!.split(" ")
        if (b=="enter") {
            map.put(a,b)
        }else {
            map.remove(a)
        }
    }
    map.toSortedMap(reverseOrder()).forEach{ println(it.key) }
}