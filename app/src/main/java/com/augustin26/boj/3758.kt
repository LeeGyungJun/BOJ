package com.augustin26.boj

import java.io.BufferedReader
import java.io.InputStreamReader
//KCPC
fun main()=with(BufferedReader(InputStreamReader(System.`in`))){
    repeat(readLine()!!.toInt()) {
        //팀의 개수, 문제의 개수, 내팀 ID, 로그 엔트리 개수
        val (n,k,t,m) = readLine()!!.split(" ").map { it.toInt() }
        val list1 = mutableMapOf<Log,Int>() // 제출한 문제의 최대값만 저장
        val list2 = mutableMapOf<Int,Int>() // 팀별 제출 횟수
        val list3 = mutableMapOf<Int,Int>() // 제출 순서
        val rs = mutableListOf<LogCompare>()
        // 1. 최종 점수가 높을수록
        // 2. 제출 횟수가 적을수록
        // 3. 마지막 제출 시간이 더 빠를수록
        repeat(m) {
            //팀 ID, 문제 번호, 점수
            val (i,j,s) = readLine()!!.split(" ").map { it.toInt() }
            //최대값만 넣기
            if (list1.containsKey(Log(i,j))) {
                if (list1[Log(i,j)]!! < s) list1[Log(i,j)] = s
            }else {
                list1[Log(i,j)] = s
            }
            //제출횟수
            if (list2.containsKey(i)) {
                list2[i] = list2[i]!!+1
            }else {
                list2[i] = 1
            }
            list3[i]=it
        }
        for (t in 1..n) {
            var s = 0
            val count = list2[t]?:0
            val index = list3[t]?:0
            list1.forEach { if (it.key.i==t) s+=it.value }
            rs.add(LogCompare(t,s,count,index))
        }
        val result = rs.sortedWith(Comparator { o1, o2 ->
            if (o1.s == o2.s)
                if (o1.count == o2.count)
                    o1.index.compareTo(o2.index)
                else
                    o1.count.compareTo(o2.count)
            else
                o2.s.compareTo(o1.s)
        })
        result.forEachIndexed { index, logCompare ->
            if (logCompare.i==t) println(index+1)
        }
    }
}

data class Log(val i:Int,val j:Int)
data class LogCompare(val i:Int, val s:Int, val count:Int, val index:Int)
