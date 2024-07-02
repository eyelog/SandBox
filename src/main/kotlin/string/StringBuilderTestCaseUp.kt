package string

private fun splitDigitsAndLetters(input: String): String {
    val digits = StringBuilder()
    val letters = StringBuilder()

    input.forEach {
        if (it.isDigit()) {
            digits.append(it)
        } else {
            letters.append(it)
        }
    }

    return "${digits.trim()} ${letters.trim()}"
}