package com.augustin26.boj
//그룹 단어 체커
fun main() {
    var result = 0
    repeat(readLine()!!.toInt()) {
        val str = readLine()!!
        val arr = mutableSetOf<Char>()
        var flag = false
        for (i in str.indices){
            if (!arr.contains(str[i])) {
                arr.add(str[i])
            }else if (str[i]==str[i-1]){
                arr.add(str[i])
            }else {
                flag=true
            }
        }
        if (!flag) result++
    }
    println(result)
}