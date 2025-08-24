package yandex.binary
import java.io.File

fun main(args: Array<String>) {

    var outCounter = 0
    var tempCounter = 0
    var binaryString: String = ""

    val count = File("src/main/kotlin/yandex/binary/input.txt").useLines { it.firstOrNull() }?.toInt()

    File("src/main/kotlin/yandex/binary/input.txt").forEachLine {
        binaryString += it
    }

    binaryString = binaryString.substring(1, binaryString.length)

    if (count != null) {
        binaryString.forEach { char ->
            if (char == '1'){
                tempCounter++
            } else {
                if (tempCounter > outCounter){
                    outCounter = tempCounter
                }
                tempCounter = 0
            }
        }
    }

    File("src/main/kotlin/yandex/binary/output.txt").writeText(outCounter.toString())
    println(outCounter)
}