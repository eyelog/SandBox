package nullable

fun main() {

    val list: CharSequence? = null
//    val list: CharSequence? = ""
//    val list: CharSequence? = "null"

    if(list?.isEmpty() == true){
        println("list true")
    } else {
        println("list false")
    }
}