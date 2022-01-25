package com.augustin26.boj

//NoMoPhobia
fun main() {
    while (true) {
        val (a,b) = readLine()!!.split(" ").map { it.toInt() }
        val name = mutableListOf<String>()
        val score = mutableListOf<Int>()
        val result = mutableListOf<String>()
        if (a+b==0) break
        repeat(b) {
            val (x,y) = readLine()!!.split(" ")
            if (!name.contains(x)) {
                name.add(x)
                score.add(what(y))
            } else score[name.indexOf(x)] += what(y)
        }
        for (i in score.indices) {
            if (score[i]>=100) result.add(name[i])
        }
        if (result.size>0) {
            print("Week $a ")
            for (i in result.indices) {
                print(result[i])
                if (i<result.size-1) {
                    print(",")
                }
            }
        } else {
            print("Week $a No phones confiscated")
        }
        println()
    }

}

fun what(st:String) : Int {
    return when (st) {
        "TT" -> 75
        "TX" -> 50
        "PR" -> 80
        "RT" -> 30
        "AP" -> 25
        "PX" -> 60
        else -> 0
    }
}