package loops

fun main() {

    val COUNT_ITEMS = 10
    var counter = 0

//    for (i in 0 until COUNT_ITEMS) { counter++ }

    repeat(COUNT_ITEMS) { counter++ }


    println(counter)
}