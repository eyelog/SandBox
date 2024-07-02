import kotlin.math.pow

fun main() {

    val screens = mutableListOf(480f, 787f, 1233f, 1541f, 2250f)
    val speeds = mutableListOf(0.55f, 0.5f, 0.45f, 0.4f, 0.35f)
    val someCon = 5f

    screens.forEach {
        val comp = someCon / it.pow(0.36f)
        println(comp)
    }
}