package yandex.duplicates
import java.io.File

fun main(args: Array<String>) {

    var inData = ""

    File("src/main/kotlin/yandex/duplicates/input.txt").forEachLine {
        inData += it
    }

    inData = inData.substring(1, inData.length)

    val outData = inData.toSet().joinToString().filter { it != ',' }


    File("src/main/kotlin/yandex/duplicates/output.txt").writeText(outData)
    println(outData)
}