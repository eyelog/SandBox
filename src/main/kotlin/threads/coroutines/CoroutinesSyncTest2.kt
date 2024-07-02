package threads.coroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

val scope = CoroutineScope(Job())

//fun main() {
//    scope.launch { criticalSectionSuspending() }
//}
//
//@Synchronized
//suspend fun criticalSectionSuspending() {
//    println("Starting!")
//    delay(10)
//    println("Ending!")
//}