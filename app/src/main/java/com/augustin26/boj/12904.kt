package com.augustin26.boj

//A와 B
fun main() {
    val s = readLine()!!
    var t = readLine()!!
    while (true) {
        if (t.length==s.length) {
            if (t==s) {
                print(1)
            }else{
                print(0)
            }
            break
        }
        if (t.last()=='A') {
            t = t.dropLast(1)
        }else if (t.last()=='B'){
            t = t.dropLast(1).reversed()
        }
    }
}