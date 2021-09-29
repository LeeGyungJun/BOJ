package com.augustin26.boj
//크로아티아 알파벳
fun main() {
    val arr = arrayOf("c=","c-","dz=","d-","lj","nj","s=","z=")
    var str = readLine()!!
    arr.forEach {
        str = str.replace(it,"0")
    }
    print(str.length)
}