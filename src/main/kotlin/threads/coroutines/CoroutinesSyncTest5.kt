package threads.coroutines

import kotlinx.coroutines.*

fun main() {
    CoroutineScope(Dispatchers.IO).launch {
        println(doWorldSupUp())
    }
}

// Concurrently executes both sections
suspend fun doWorldSupUp(): String { // this: CoroutineScope
    delay(2000L)
    println("World 2")
    return "Hello"
}