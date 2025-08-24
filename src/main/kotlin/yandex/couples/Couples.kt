package yandex.couples

import java.util.LinkedList

fun main() {

    var outData = 0

    val array = arrayOf(1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 6)
    array.shuffle()

    val workCollection = array.toMutableList()

    var tempSizeCounter = 0
    do {
        tempSizeCounter = workCollection.size
        outData = workCollection.first()
        workCollection.removeIf{ it == outData }
        if (tempSizeCounter - workCollection.size == 1) break
    } while (workCollection.size > 1)

    println(workCollection)



    println(outData)
}