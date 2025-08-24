package yandex.school_tasks.plate_sets

import java.io.*
import kotlin.math.abs

fun main() {
    val input = BufferedReader(FileReader("src/main/kotlin/yandex/school_tasks/plate_sets/input.txt"))
    val output = BufferedWriter(FileWriter("src/main/kotlin/yandex/school_tasks/plate_sets/output.txt"))

    val linesList = mutableListOf<String>()

    input.lines().forEach {
        linesList.add(it)
    }

    val numberOfLines = linesList.first().split(" ")[0].toInt()
    val numberOfPassengers = linesList.first().split(" ")[1].toInt()

    linesList.removeAt(0)

    println("numberOfLines $numberOfLines")
    println("numberOfPassengers $numberOfPassengers")

    var countOfUnfreeSets = 0
    linesList.forEach {
        countOfUnfreeSets += it.count { char -> char == 'X' }
    }

    val countOnFreeSets = numberOfLines * 6 - countOfUnfreeSets

    println("countOfUnfreeSets $countOfUnfreeSets")
    println("countOnFreeSets $countOnFreeSets")

    if (countOnFreeSets < numberOfPassengers) {
        println("Impossible")
    } else {
        if ((numberOfPassengers + countOfUnfreeSets) % 2 != 0) {
            println("Impossible")
        } else {
            // Рассаживаем
            val outList = mutableListOf<String>()
            var tmpLine = CharArray(6)
            tmpLine.fill('.')
            var passengerCounter = numberOfPassengers
            linesList.forEach {  line ->
                for (i in 0..2) {
                    if (passengerCounter > 0) {
                        println("passengerCounter $passengerCounter")
                        when {
                            (line[i] == 'X' && line[abs(i - 5)] == '.') -> {
                                tmpLine[i]= 'X'
                                tmpLine[abs(i - 5)] = 'X'
                                passengerCounter--
                            }
                            (line[i] == '.' && line[abs(i - 5)] == 'X') -> {
                                tmpLine[i]= 'X'
                                tmpLine[abs(i - 5)] = 'X'
                                passengerCounter--
                            }
                            else -> {
                                tmpLine[i] = line[i]
                                tmpLine[abs(i - 5)] = line[abs(i - 5)]
                            }
                        }
                    } else {
                        tmpLine[i] = line[i]
                        tmpLine[abs(i - 5)] = line[abs(i - 5)]
                    }
                }
                outList.add(tmpLine.joinToString(""))
                tmpLine = CharArray(6)
                tmpLine.fill('.')
            }

            if (passengerCounter > 0) {
                val subOutList = mutableListOf<String>()
                outList.forEach {  line ->
                    tmpLine = line.toCharArray()
                    for (i in 0..2) {
                        if (passengerCounter > 0) {
                            println("passengerCounter $passengerCounter")
                            if (line[i] == '.' && line[abs(i - 5)] == '.') {
                                tmpLine[i] = 'X'
                                passengerCounter--
                                tmpLine[abs(i - 5)] = 'X'
                                passengerCounter--
                            } else {
                                tmpLine[i] = line[i]
                                tmpLine[abs(i - 5)] = line[abs(i - 5)]
                            }
                        } else {
                            tmpLine[i] = line[i]
                            tmpLine[abs(i - 5)] = line[abs(i - 5)]
                        }
                    }
                    subOutList.add(tmpLine.joinToString(""))
                }

                println("outList $subOutList")
            } else {
                println("outList $outList")
            }
        }
    }



//    output.write((numberStrings[0].toInt() + numberStrings[1].toInt()).toString())
//    output.flush()
}