package yandex.anagram

fun main() {

    val a = "qiui"
    val b = "iuqi"

    val aMap = mutableMapOf<Char, Int>()
    val bMap = mutableMapOf<Char, Int>()

    a.map {
        aMap[it] = aMap[it]?.plus(1) ?: 1
    }
    b.map {
        bMap[it] = bMap[it]?.plus(1) ?: 1
    }

    if (aMap == bMap){
        println(1)
    } else {
        println(0)
    }

    println(aMap)
    println(bMap)
}