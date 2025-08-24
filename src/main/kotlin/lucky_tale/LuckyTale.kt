package lucky_tale

import ru.eyelog.luckytale2.db.models.Model749

fun main() {

    val mainList = listOf(
        Model749(
            numb = 0,
            date = "Date",
            listOf(1, 3, 9, 11, 12, 18, 39)
        ),
        Model749(
            numb = 0,
            date = "Date",
            listOf(42, 17, 6, 5, 10, 18, 47)
        ),
        Model749(
            numb = 0,
            date = "Date",
            listOf(32, 13, 7, 21, 9, 15, 6)
        ),
        Model749(
            numb = 0,
            date = "Date",
            listOf(1, 4, 28, 29, 30, 11, 41)
        ),
        Model749(
            numb = 0,
            date = "Date",
            listOf(5, 8, 9, 10, 46, 11, 33)
        )
    )


    val currentSelectedItems = listOf(1, 3, 9, 11, 12, 18, 42)

    calculateSuggestedList(mainList, currentSelectedItems).forEach {
        println(it)
    }
}

fun calculateSuggestedList(
    mainList: List<Model749>,
    collectedList: List<Int>
): List<String> {
    val currentCalculatedItems = mutableListOf<String>()

    val calculatedMap = hashMapOf(
        0 to 0,
        1 to 0,
        2 to 0,
        3 to 0,
        4 to 0,
        5 to 0,
        6 to 0,
        7 to 0
    )

    var alignmentCounter = 0

    mainList.forEach { model749 ->
        model749.numList.forEach { doneNomb ->
            if (collectedList.contains(doneNomb)){
                alignmentCounter++
            }
        }

        calculatedMap[alignmentCounter] = calculatedMap[alignmentCounter]?.plus(1) ?: 1
        alignmentCounter = 0
    }

    calculatedMap.entries.forEach { mapOne ->
        currentCalculatedItems.add("Sign of ${mapOne.key}: ${mapOne.value} alignments")
    }


    return currentCalculatedItems.toList()
}
