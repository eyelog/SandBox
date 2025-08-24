package birds

fun main() {

    doSomeThing(Sparrow())
    doSomeThing(Raven())
    doSomeThing(1)
}

fun doSomeThing(a: Any){

    val c = a is Sparrow

    println(c)
}


interface Bird

class Raven: Bird

class Sparrow: Bird