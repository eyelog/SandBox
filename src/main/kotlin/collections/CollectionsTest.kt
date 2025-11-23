package collections

import java.util.ArrayList
import java.util.LinkedList

private const val INDEX = 1

fun main() {

    testSimpleList()
}

fun testLinkedList(){
    val testList = LinkedList<Int>()
    repeat(1){
        testList.add(it)
    }

    if (testList.size > INDEX){
        testList.removeAt(INDEX)
    }

    println(testList)
}

fun testSimpleList(){
    val testList = ArrayList<Int>()
    repeat(10){
        testList.add(it)
    }

    if (testList.size > INDEX){
        testList.removeAt(INDEX)
    }

    println(testList)
}