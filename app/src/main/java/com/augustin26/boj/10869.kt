package com.augustin26.boj
//사칙연산
fun main(){val(a,b)=readLine()!!.split(" ").map(String::toInt)
    print("${a+b}\n${a-b}\n${a*b}\n${a/b}\n${a%b}\n")}