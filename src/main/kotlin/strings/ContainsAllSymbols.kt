package strings

fun main() {

    val str = "ABC"
    val checkStr = "BAC"

    fun areTheSame(str1: String, str2: String): Boolean {
        if (str1.length != str2.length) return false

        val charCount1 = str1.groupingBy { it }.eachCount()
        val charCount2 = str2.groupingBy { it }.eachCount()

        return charCount1 == charCount2
    }


    println(areTheSame(str, checkStr))
}