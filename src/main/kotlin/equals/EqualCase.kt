package equals

fun main() {

    val isError = false

    val payload = if (isError) {
        "zap"
    } else {
        null
    }

    println(payload)
}