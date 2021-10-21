package com.augustin26.boj
//분수 합

fun main() {
    val (a,b) = readLine()!!.split(" ").map { it.toInt() }
    val (x,y) = readLine()!!.split(" ").map { it.toInt() }
    var ja = a*y + x*b
    var mo = b*y
    val mod = gcd1(ja, mo)
    ja /= mod
    mo /= mod

    print("$ja $mo")
}

fun gcd1(a: Int, b: Int): Int {
    var maximum = a.coerceAtLeast(b)
    var minimum = a.coerceAtMost(b)

    if (minimum == 0) {
        return maximum
    } else {
        return gcd1(minimum, maximum % minimum)
    }
}