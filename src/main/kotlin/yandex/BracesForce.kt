package yandex

fun main() {

    val number = 2
    val note = "()"
    var braceCollector = ""

    for (i in 0..number){
        for (j in i..number){
            braceCollector += note
            println(braceCollector)
        }
    }
}