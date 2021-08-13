package com.augustin26.boj

//숫자놀이
import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    val y = sc.nextInt()
    var ten:Int
    var one:Int
    var arr = mutableListOf<String>()
    for (i in x..y) {
        ten = i/10 as Int
        one = i%10
        if (ten==0) {
            arr.add(check(one,null))
        }else{
            arr.add(check(ten,null).plus(" " + check(one,null)))
        }
    }
    arr.sort()

    for (i in 0 until arr.size) {
        val temp = arr[i].split(" ")
        if (temp.size>1) {
            print("${check(null, temp[0]).plus(check(null, temp[1])).toInt()} ")
        }else{
            print("${check(null, arr[i]).toInt()} ")
        }
        if (i%10==9 && i!=0) {
            println()
        }
    }
}
fun check(n:Int?, s:String?) : String {
    if(n!=null) {
        return when (n) {
            0-> "zero"
            1-> "one"
            2-> "two"
            3-> "three"
            4-> "four"
            5-> "five"
            6-> "six"
            7-> "seven"
            8-> "eight"
            9-> "nine"
            else-> ""
        }
    }else{
        return when (s) {
            "zero"-> "0"
            "one"-> "1"
            "two"-> "2"
            "three"-> "3"
            "four"-> "4"
            "five"-> "5"
            "six"-> "6"
            "seven"-> "7"
            "eight"-> "8"
            "nine"-> "9"
            else-> ""
        }
    }
}