package com.augustin26.boj

//ROF13
fun main() {
    readLine()!!.forEach {
        if (it.code in 65..90) {
            print(if (it.code+13 > 90) "${(it.code-13).toChar()}" else "${(it.code+13).toChar()}")
        }else if (it.code in 97..122){
            print(if (it.code+13 > 122) "${(it.code-13).toChar()}" else "${(it.code+13).toChar()}")
        }else {
            print(it)
        }
    }
}