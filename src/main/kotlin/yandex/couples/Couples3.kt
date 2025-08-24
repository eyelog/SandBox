package yandex.couples

fun main() {

    var outData = 0

    val array = arrayOf(1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 6)
    array.shuffle()

    array.sort()

    val i = array.indices.find {
        ((it == 0) || array[it] != array[it -1])
                && (it == array.lastIndex || array[it] != array[it + 1])
    } ?: 0
    outData = array[i]

    println(outData)
}
