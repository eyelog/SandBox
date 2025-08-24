package yandex.couples

fun main() {

    var outData = 0

    val array = arrayOf(1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 6)
    array.shuffle()

    val outDataArray = array.distinct()

    println(outDataArray)
}
