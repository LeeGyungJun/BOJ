package com.augustin26.boj
//사이클 단어
fun main() {
    var temp = ""
    val pattern = mutableListOf<String>()
    val length = mutableListOf<Int>()
    val list = mutableListOf<String>()
    repeat(readLine()!!.toInt()) {
        list.add(readLine()!!)
    }
    list.forEach { it1->
        if (!length.contains(it1.length)) {
            //새로운 패턴
            length.add(it1.length)
            pattern.add(it1)
        }else {
            //비교 시작
            run {
                pattern.forEach { it2-> //it2 = 기준이 될 패턴
                    var new = it1
                    if (it2.length==new.length) {
                        for (i in it2.indices) {
                            if (it2!=new) {
                                //패턴 비교
                                //앞글자를 뒤로 붙이기
                                new += new[0]
                                new = new.drop(1)
                            }else{
                                //길이도 같고 패턴도 같다
                                return@run
                            }
                        }
                        temp=it1
                    }
                }
                if (temp!="") {
                    pattern.add(temp)
                    temp=""
                }
            }
        }
    }
    println(pattern.size)
}