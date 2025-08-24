package yandex.anagram

fun main() {

    val a = "qiur"
    val b = "iuqi"

    val c = a.toList().sorted().joinToString()
    val d = b.toList().sorted().joinToString()

    println(c)
    println(d)


    if (c == d){
        println("1")
    } else {
        println("0")
    }
}