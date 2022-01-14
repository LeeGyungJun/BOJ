package com.augustin26.boj

//여우는 어떻게 울지?
import java.io.BufferedReader
import java.io.InputStreamReader

fun main()=with(BufferedReader(InputStreamReader(System.`in`))) {
    repeat(readLine()!!.toInt()) {
        val animals = readLine()!!.split(" ").toMutableList()
        val remove = mutableListOf<String>()
        while (true) {
            val str = readLine()!!
            if (str == "what does the fox say?") break
            remove.add(str.split(" ")[2])
        }
        animals.removeAll(remove)
        animals.forEach { print("$it ") }
    }
}