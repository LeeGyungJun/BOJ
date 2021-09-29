package com.augustin26.boj
//DFS와 BFS
import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

var nmv: List<Int> = listOf()
var matrix: Array<IntArray> = arrayOf()
var visited = booleanArrayOf()

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    nmv = readLine().split(" ").map { it.toInt() }
    matrix = Array(nmv[0]) { IntArray(nmv[0]) }
    visited = BooleanArray(nmv[0])

    repeat(nmv[1]) {
        val xy = readLine().split(" ").map { it.toInt() }

        matrix[xy[0] - 1][xy[1] - 1] = 1
        matrix[xy[1] - 1][xy[0] - 1] = 1
    }

    visited.fill(false)
    dfs(nmv[2] - 1)

    println()
    visited.fill(false)
    bfs(nmv[2] - 1)
}

fun dfs(v: Int) {
    visited[v] = true
    print("${v + 1} ")
    for (i in 0 until nmv[0]) {
        if (matrix[v][i] == 1 && !visited[i])
            dfs(i)
    }
}

fun bfs(v: Int) {
    val list: LinkedList<Int> = LinkedList()
    list.add(v)
    visited[v] = true
    print("${v + 1} ")
    while (list.isNotEmpty()) {
        val now = list.poll()
        for (i in 0 until nmv[0]) {
            if (matrix[now][i] == 1 && !visited[i]) {
                list.add(i)
                visited[i] = true
                print("${i + 1} ")
            }
        }
    }
}