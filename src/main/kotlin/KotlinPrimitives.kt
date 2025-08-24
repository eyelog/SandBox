fun main() {

    val a: Int = 1
    val b: SubClass = SubClass(2)

    ObjectClass.c = "2"

    println(a)
    println(b)
    println(ObjectClass)
}

class SubClass(val b: Int = 0)

object ObjectClass{
    var c = ""
}