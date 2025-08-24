fun main() {

    val b: String = "b"

//    val c: String = someFun(b)
    val c: String = b.getSomeVal().getSomeVal().getSomeVal().getSomeVal().getSomeVal()

    println(c)
}

fun someFun(a: String): String{
    return "$a 1"
}

fun String.getSomeVal(): String{
    return "$this 1"
}

