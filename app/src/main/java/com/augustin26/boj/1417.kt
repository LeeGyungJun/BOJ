package com.augustin26.boj

//국회의원 선거
import java.io.BufferedReader
import java.io.InputStreamReader

fun main()=with(BufferedReader(InputStreamReader(System.`in`))) {
    val list = mutableListOf<Int>()
    var rs = 0
    repeat(readLine()!!.toInt()) {
        list.add(readLine()!!.toInt())
    }
    while (list.indexOf(list.maxOrNull())!=0 || list.count {it==list.maxOrNull()}>1) {
        if (list.count {it==list.maxOrNull()}>1) {
            if (list.indexOf(list.maxOrNull())==0) {
                val temp = list
                list[temp.drop(1).indexOf(list.maxOrNull())+1]
                list[0]++
                rs++
            }else {
                list[list.indexOf(list.maxOrNull())]--
                list[0]++
                rs++
            }
        }else {
            list[list.indexOf(list.maxOrNull())]--
            list[0]++
            rs++
        }
    }
    print(rs)
}