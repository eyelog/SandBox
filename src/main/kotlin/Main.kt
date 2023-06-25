fun main() {

    val list = listOf(0,1,2,3,4,5, 6)
//    val stringList = mutableListOf<String>()
//
//    list.forEach { i ->
//        stringList.add(turnToString(i))
//    }

    for (i in 0 .. 4 step 2) {
        println(list[i])
    }

    val stringList = list.map {
        turnToString(it)
    }

    println(stringList)
}

fun turnToString(i: Int): String{
    return "$i s"
}