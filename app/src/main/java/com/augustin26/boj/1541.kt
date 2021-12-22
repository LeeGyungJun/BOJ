package com.augustin26.boj

//잃어버린 괄호
fun main() {
    var plus = mutableListOf<Int>()
    var minus = mutableListOf<Int>()
    var str = ""
    var minu = false
    readLine()!!.forEach {
        if (it!='+' && it!='-') {
            str+=it
        } else if (minu){
            minus.add(str.toInt())
            str = ""
        } else if (it=='-') {
            plus.add(str.toInt())
            str = ""
            minu = !minu
        } else {
            plus.add(str.toInt())
            str = ""
        }
    }
    if (str!="") {
        if (minu) {
            minus.add(str.toInt())
        }else {
            plus.add(str.toInt())
        }
    }
    print(plus.sum()-minus.sum())
}