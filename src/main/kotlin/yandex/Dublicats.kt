package yandex

fun main() {
    val inData = "4356183154682"
    var outData = ""

    inData.forEach { char ->
        if (!outData.contains(char)){
            outData += char
        }
    }

    println(outData)
}

