package nullable

fun main() {


//    val arrayList = arrayListOf(0, 1, 2, 3)
    val arrayList = listOf(0, 1, 2, 3)
    val dynamicFields = mapOf(0 to 0, 1 to 1, 2 to 2)

    val a: Int? = null

    println(dynamicFields[a])
}