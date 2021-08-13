package com.augustin26.boj

//절댓값 힙
import java.util.*
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw= BufferedWriter(OutputStreamWriter(System.`out`))
    val heap = PriorityQueue<Int>()
    var list = mutableListOf<Int>()
    repeat(readLine().toInt()) {
        var x = readLine().toInt()
        if(x<0) {
            x*=-1
            list.add(x)
        }
        if(x==0){
            if(heap.isEmpty()) {
                bw.write("0\n")
            }else if (list.contains(heap.peek())){
                list.remove(heap.peek())
                bw.write("${heap.poll()*-1}\n")
            }else{
                bw.write("${heap.poll()}\n")
            }
        }else{
            heap.add(x)
        }
    }
    bw.flush()
    bw.close()
    close()
}