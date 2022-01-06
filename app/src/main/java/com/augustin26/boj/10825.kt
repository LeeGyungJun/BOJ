package com.augustin26.boj

//국영수
import kotlin.Comparator
import java.io.*

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(System.out.bufferedWriter())
    val list = List(readLine().toInt()) {
        val (a, b, c, d) = readLine().split(" ")
        Student(a, b.toInt(), c.toInt(), d.toInt())
    }

    val result = list.sortedWith(Comparator { o1, o2 ->
        if (o1.korean == o2.korean)
            if (o1.english == o2.english)
                if (o1.math == o2.math)
                    o1.name.compareTo(o2.name)
                else
                    o2.math.compareTo(o1.math)
            else
                o1.english.compareTo(o2.english)
        else
            o2.korean.compareTo(o1.korean)
    })

    result.forEach { bw.write("${it.name}\n") }
    bw.flush()
    bw.close()
}

class Student(
    val name: String,
    val korean: Int,
    val english: Int,
    val math: Int
)