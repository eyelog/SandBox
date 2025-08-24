package yandex.olimp

import java.io.File

fun main() {

    val str = File("input.txt").readText()
//    val str = File("src/main/kotlin/yandex/olimp/input.txt").readText()

    val a = str.substring(0, str.indexOf(" ")).trim().toInt()
    val b = str.substring(str.indexOf(" ") + 1, str.length).trim().toInt()
    val c = a + b

    File("output.txt").writeText(c.toString())
//    File("src/main/kotlin/yandex/olimp/output.txt").writeText(c.toString())
}