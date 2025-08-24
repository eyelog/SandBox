package yandex.olimp

fun main() {

    val str = readLine()!!

    val a = str.substring(0, str.indexOf(" ")).toInt()
    val b = str.substring(str.indexOf(" ") + 1, str.length).toInt()
    val c = a + b

    println(c)
}