package strings

fun main() {

    val listOfSymbols = listOf("A", "B", "C")
    val dateList = listOf(
        ImageEntity(symbol = "A", imageId = 1),
        ImageEntity(symbol = "B", imageId = 6),
        ImageEntity(symbol = "C", imageId = 1),
        ImageEntity(symbol = "A", imageId = 2),
        ImageEntity(symbol = "B", imageId = 2),
        ImageEntity(symbol = "A", imageId = 3),
        ImageEntity(symbol = "C", imageId = 3),
        ImageEntity(symbol = "A", imageId = 4),
        ImageEntity(symbol = "A", imageId = 5),
        ImageEntity(symbol = "A", imageId = 6),
        ImageEntity(symbol = "B", imageId = 1),
        ImageEntity(symbol = "C", imageId = 6),
    )

    println(findWholeEquals(listOfSymbols, dateList))
}

fun findWholeEquals(emojis: List<String>, data: List<ImageEntity>): List<Long> {

    // Группируем по imageId и собираем символы для каждого imageId
    val imageIdToSymbols = data
        .groupBy { it.imageId }
        .mapValues { (_, entities) -> entities.map { it.symbol }.toSet() }

    // Фильтруем только те imageId, которые содержат все символы из listOfSymbols
    return imageIdToSymbols
        .filter { (_, symbols) -> symbols.containsAll(emojis.toSet()) }
        .keys
        .toList()
        .sorted()
}

data class ImageEntity(
    val id: Long = 0,
    val symbol: String = "",
    val imageId: Long = 0,
    val userId: Long = 0
)