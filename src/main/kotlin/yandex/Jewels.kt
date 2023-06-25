package yandex

fun main(args: Array<String>) {
    val j = readLine()!!
    val s = readLine()!!

    var result = 0
    for (c in s) {
        if (j.contains(c)) {
            result++
        }
    }

    println(result)
}