package com.augustin26.boj
//음계 ( List 와 Set 이용)
fun main() {
    val arr = readLine()!!.split(" ").map { it.toInt()}.toMutableList()
    var comp = arr.removeAt(0)
    val set = mutableSetOf<String>()
    arr.forEach {
        if (it>comp) {
            set.add("ascending")
            comp = it
        }
        else if (it<comp) {
            set.add("descending")
            comp = it
        }
    }
    print(if (set.size>1) "mixed" else set.toList()[0])
}