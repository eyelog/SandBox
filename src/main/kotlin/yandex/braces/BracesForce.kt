package yandex.braces

fun main() {

    var n = 5
    var indexCounter = 1

    if (n < 1) return
    n *= 2
    val chars = CharArray(n)
    for (i in 0 until n / 2) {
        chars[i] = '('
    }
    for (i in n / 2 until n) {
        chars[i] = ')'
    }
    println(chars)
    do {
        var i = n - 1
        var c = 0
//        println("input i = $i")
//        println("")
        while (i >= 0) {
            c += if (chars[i] == ')') -1 else 1
            if ((c < 0) && (chars[i] == '(')) break
            i--
        }

//        println("i = $i")
//        println("c = $c")

        if (i < 0) break

        chars[i] = ')'
//        println("chars after shift")
//        println(chars)
//        println("")

        val index = ++i
//        println("index = $index")
//        println("i = $i")
//        println("n = $n")
//        println("")
        while (i < n) {
            val subShift = (n - index + c) / 2 + index
//            println("i = $i")
//            println("subShift = $subShift")
            chars[i] = if (i <= subShift) '(' else ')'
            i++
//            println("subchars")
//            println(chars)
        }
//        println("")

        indexCounter++
        println(chars)
//        println("")
//        println("New Loop ---------------------->")
//        println("")
    } while (true)

    println(indexCounter)
}