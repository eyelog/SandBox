package strings

fun main() {

    val dateList = listOf(
        ImageEntity(symbol = "A", userId = 1),
        ImageEntity(symbol = "B", userId = 6),
        ImageEntity(symbol = "C", userId = 1),
        ImageEntity(symbol = "A", userId = 2),
        ImageEntity(symbol = "B", userId = 2),
        ImageEntity(symbol = "A", userId = 3),
        ImageEntity(symbol = "C", userId = 3),
        ImageEntity(symbol = "A", userId = 4),
        ImageEntity(symbol = "A", userId = 5),
        ImageEntity(symbol = "A", userId = 6),
        ImageEntity(symbol = "B", userId = 1),
        ImageEntity(symbol = "C", userId = 6),
        ImageEntity(symbol = "C", userId = 6),
    )

    println(sortSymbolsByRange(dateList))
}
fun sortSymbolsByRange(data: List<ImageEntity>): List<String> {
    return data.groupingBy { it.symbol }
        .eachCount()
        .entries
        .sortedByDescending { it.value }
        .map { it.key }
}
