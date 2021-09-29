package com.augustin26.boj
//문서 검색
fun main(){val a=readLine()!!;val b=readLine()!!;print((a.length-a.replace(b,"").length)/b.length)}