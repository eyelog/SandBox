package yandex.binary

fun main() {
    val binary = readLine()!!

    var outCounter = 0
    var tempCounter = 0

    binary.forEach { char ->
        if (char == '1'){
            tempCounter++
        } else {
            if (tempCounter > outCounter){
                outCounter = tempCounter
            }
            tempCounter = 0
        }
    }

    println(outCounter)
}