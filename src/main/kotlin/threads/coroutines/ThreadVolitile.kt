package threads.coroutines

import kotlin.concurrent.thread

@Volatile var tmpEndedAt: Int = 0

fun main() {
    repeat(2) {
        thread { countFunction() }
    }


}


fun countFunction() {
    tmpEndedAt++

    println(tmpEndedAt)
}