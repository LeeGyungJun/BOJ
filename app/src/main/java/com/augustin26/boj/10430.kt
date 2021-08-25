package com.augustin26.boj
//나머지
fun main(){val(A,B,C)=readLine()!!.split(" ").map{it.toInt()}
    print("${(A+B)%C}\n${(A%C+B%C)%C}\n${A*B%C}\n${A%C*B%C%C}")}