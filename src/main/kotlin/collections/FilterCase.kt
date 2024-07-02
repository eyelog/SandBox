package collections

fun main() {

    val testList = listOf(emptyList(), null, listOf(1, 2, 3), emptyList(), listOf(4, 5, 6))

    val filteredList = testList.filter { !it.isNullOrEmpty() && it.contains(3) }

    println(filteredList)
}