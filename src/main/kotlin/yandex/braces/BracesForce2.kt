package yandex.braces

fun main() {

    var n = 5

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
        var index = n - 1
        var braceCounter = 0
        while (index >= 0) {
            braceCounter += if (chars[index] == ')') -1 else 1
            if ((braceCounter < 0) && (chars[index] == '(')) break
            index--
        }

        if (index < 0) break

        chars[index] = ')'
        val subIndex = ++index
        while (index < n) {
            val shiftIndex = (n - subIndex + braceCounter) / 2 + subIndex
            chars[index] = if (index <= shiftIndex) '(' else ')'
            index++
        }

        println(chars)
    } while (true)
}