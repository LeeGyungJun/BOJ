package com.augustin26.boj

//팩토리얼 5 (0을 제외한 뒤 5자리 구하기, 틀렸다는데 왜 틀린지는 모르겠고 난 맞은거라고 생각함)
import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    var result:Long = 1
    var str = ""

    for (i in n downTo 2) {
        result *= i
        while (result%10<1) {
            result /= 10
        }
        result %= 1000000000
    }
    result %= 1000000
    str = result.toString()
    if (str.length==5) {
        print(str)
    }else if(str.length>5) {
        print(str.substring(1,str.length))
    }else{
        var z = "0"
        print(z.plus(result))
    }
}