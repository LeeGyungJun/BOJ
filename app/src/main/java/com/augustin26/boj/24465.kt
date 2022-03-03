package com.augustin26.boj

//데뷔의 꿈
import java.io.BufferedReader
import java.io.InputStreamReader

fun main()=with(BufferedReader(InputStreamReader(System.`in`))) {
    val member = mutableListOf<List<Int>>()
    val star = mutableSetOf<String>()
    var result = mutableListOf<List<Int>>()
    repeat(7) {
        val l = readLine()!!.split(" ").map { it.toInt() }
        member.add(l)
        star.add(starCheck(l))
    }
    repeat(readLine()!!.toInt()) {
        val st = readLine()!!
        val l = st.split(" ").map { it.toInt() }
        if (!star.contains(starCheck(l))) {
            result.add(l)
        }
    }
    val a = result.sortedWith(compareBy({it[0]},{it[1]}))
    if (a.isEmpty()) {
        print("ALL FAILED")
    }else {
        a.forEach {
            println("${it[0]} ${it[1]}")
        }
    }
}

fun starCheck(list : List<Int>) : String {
    when (list[0]) {
        1-> {
            return if (list[1]>=20) {
                "물병"
            }else {
                "염소"
            }
        }
        2-> {
            return if (list[1]>=19) {
                "물고기"
            }else {
                "물병"
            }
        }
        3-> {
            return if (list[1]>=21) {
                "양"
            }else {
                "물고기"
            }
        }
        4-> {
            return if (list[1]>=20) {
                "황소"
            }else {
                "양"
            }
        }
        5-> {
            return if (list[1]>=21) {
                "쌍둥이"
            }else {
                "황소"
            }
        }
        6-> {
            return if (list[1]>=22) {
                "게"
            }else {
                "쌍둥이"
            }
        }
        7-> {
            return if (list[1]>=23) {
                "사자"
            }else {
                "게"
            }
        }
        8-> {
            return if (list[1]>=23) {
                "처녀"
            }else {
                "사자"
            }
        }
        9-> {
            return if (list[1]>=23) {
                "천칭"
            }else {
                "처녀"
            }
        }
        10-> {
            return if (list[1]>=23) {
                "전갈"
            }else {
                "천칭"
            }
        }
        11-> {
            return if (list[1]>=23) {
                "사수"
            }else {
                "전갈"
            }
        }
        12-> {
            return if (list[1]>=22) {
                "염소"
            }else {
                "사수"
            }
        }
    }
    return ""
}