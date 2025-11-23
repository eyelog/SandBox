package collections

import kotlin.random.Random


fun main() {
   println(findVisibleCardsPositions(5, 24))
}

fun findVisibleCardsPositions(
    case: Int,
    offersCount: Int,
): List<Int> {
    return (0 until offersCount).toList()
        .filter { isCardVisible(case) }
}

fun isCardVisible(case: Int): Boolean {

    val sup = Random.nextInt(7) + 4

    return case == sup

}