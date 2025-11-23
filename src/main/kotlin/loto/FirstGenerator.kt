package loto

import kotlin.random.Random

fun main() {

    val tempList = listOf(listOf(6, 18, 19, 20), listOf(4, 9, 10, 18))

    val collectList = mutableListOf<List<Int>>()
    val subCollectList = mutableListOf<Int>()
    var a = Random.nextInt(19) + 1

    for (i in 0..100000){

        repeat(4){
            while (subCollectList.contains(a)) {
                a = Random.nextInt(19) + 1
            }
            subCollectList.add(a)
        }

        collectList.add(subCollectList.toList().sorted())
        subCollectList.clear()

        repeat(4){
            while (subCollectList.contains(a)) {
                a = Random.nextInt(19) + 1
            }
            subCollectList.add(a)
        }

        collectList.add(subCollectList.toList().sorted())
        subCollectList.clear()

        // Compare with template
        val a0 = collectList[0].count { element -> element in tempList[0] }
        val a1 = collectList[1].count { element -> element in tempList[1] }

        if (a0 > 3 || a1 > 3) {
            println(collectList)
            println("$a0 x $a1")
        }

        collectList.clear()
    }
}