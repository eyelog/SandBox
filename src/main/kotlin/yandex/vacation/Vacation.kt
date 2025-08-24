package yandex.vacation

fun main() {

    val a = Town(
        number = 0,
        distance = 0.0,
        townNet = mapOf(
            1 to 1.5,
            2 to 1.3
        )
    )

}


data class Town(
    val number: Int,
    val distance: Double,
    val townNet: Map<Int, Double>
)