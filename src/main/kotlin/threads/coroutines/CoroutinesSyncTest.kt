package threads.coroutines

import kotlin.concurrent.thread

fun main() {
    repeat(2) {
        thread { criticalSection() }
    }
}

@Synchronized
fun criticalSection() {
    println("Starting!")
    Thread.sleep(10)
    println("Ending!")
}