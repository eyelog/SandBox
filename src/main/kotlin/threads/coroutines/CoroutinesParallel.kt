package threads.coroutines

import kotlinx.coroutines.*

//fun main() {
////    val coroutinesParallel = CoroutinesParallel()
//
//    println("Start")
//
//    CoroutineScope(Dispatchers.IO).launch {
//        println(coroutinesParallel.firstAddValue())
//    }
////    CoroutineScope(Dispatchers.IO).launch {
////        println(coroutinesParallel.secondAddValue())
////    }
//}

//class CoroutinesParallel {
//
//    private var susCounter = 0
//    private val sequence = Sequence<Int>()
//
//    suspend fun firstAddValue(): Int {
//        println("delay")
//        delay(2000L)
//        return ++susCounter
//    }
//
////    suspend fun secondAddValue(): Int {
////        return ++susCounter
////    }
//}