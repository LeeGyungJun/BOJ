package com.augustin26.boj
//애너그램
fun main() {
    for(i in 1..readLine()!!.toInt()) {
        val (a,b) = readLine()!!.split(" ")
        if (a.length == b.length) {
            if (a.toList().sorted()==b.toList().sorted()) {
                println("$a & $b are anagrams.")
            }else{
                println("$a & $b are NOT anagrams.")
            }
        }else {
            println("$a & $b are NOT anagrams.")
        }
    }
}