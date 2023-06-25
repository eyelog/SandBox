package exceptions

import kotlin.jvm.Throws

fun main() {
    var a = 0
    try {
        a = checkSomeValue(-2)
    } catch (e: Exception){
        if (e is NegativeNumberException){
            println("This is NegativeNumberException")
        } else {
            println("This is something wrong")
        }

    } finally {
        println(a)
    }

}

@Throws(NegativeNumberException::class)
fun checkSomeValue(int: Int): Int{
    if (int < 0){
        throw NegativeNumberException()
    }
    return int
}

class NegativeNumberException: Exception()