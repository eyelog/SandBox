package threads.coroutines

import kotlinx.coroutines.*

fun main() {
    GlobalScope.launch(Dispatchers.IO) {
        doWorldSup()
    }
}

// Concurrently executes both sections
suspend fun doWorldSup() = coroutineScope { // this: CoroutineScope
    launch {
        delay(2000L)
        println("World 2")
    }
    launch {
        delay(1000L)
        println("World 1")
    }
    println("Hello")
}