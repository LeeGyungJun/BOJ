package com.augustin26.boj
//아기 석환 뚜루루 뚜루
fun main() {
    val s = "baby sukhwan tururu turu " +
            "very cute tururu turu " +
            "in bed tururu turu " +
            "baby sukhwan"
    val arr = s.split(" ")
    val n = readLine()!!.toInt()
    val k = n/arr.size //14
    var str = if (n%arr.size==0) {
        arr[arr.size-1]
    }else{
        arr[(n%arr.size)-1]
    }
    if (k>=3 && str=="tururu") {
        print("tu+ru*${k+2}")
    }else if(k>=4 && str=="turu") {
        print("tu+ru*${k+1}")
    }else if (str=="tururu" || str=="turu"){
        repeat(k) {
            str = str.plus("ru")
        }
        print(str)
    }else{
        print(str)
    }
}