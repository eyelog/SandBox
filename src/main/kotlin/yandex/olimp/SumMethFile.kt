package yandex.olimp

import java.io.*

fun main(args: Array<String>) {
    val input = BufferedReader(FileReader("src/main/kotlin/yandex/olimp/input.txt"))
    val output = BufferedWriter(FileWriter("src/main/kotlin/yandex/olimp/output.txt"))

    val numberStrings = input.readLine()!!.split(" ")
    output.write((numberStrings[0].toInt() + numberStrings[1].toInt()).toString())
    output.flush()
}