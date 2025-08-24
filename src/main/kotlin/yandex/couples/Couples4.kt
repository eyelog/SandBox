package yandex.couples

fun main() {

    var outData = 0

    val array = arrayOf(1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6)
    array.shuffle()

    array.forEach {
        outData = outData xor it
        println(outData)
    }

    println(outData)
}
