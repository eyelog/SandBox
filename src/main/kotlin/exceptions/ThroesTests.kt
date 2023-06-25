package exceptions

import java.io.IOException

fun throwJavaUnchecked() {
    throw IllegalArgumentException()
}

fun throwJavaChecked() {
    throw IOException()
}

fun main() {
    checked()
}

fun unchecked() {
    try {
        throwJavaUnchecked()
    } catch (e: IllegalArgumentException) {
        println("Caught something!")
    }
}

fun checked() {
    try {
        throwJavaChecked()
    } catch (e: IOException) {
        println("Won't even compile")
    }
}