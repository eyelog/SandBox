package yandex.legacy_source

fun main() {

    val temperatureSource = object : LegacyDataSource<Int> {
        override fun setOnData(onData: (Int) -> Unit) {
            // Имитация асинхронных данных
            Thread {
                listOf(20, 22, 25).forEach {
                    Thread.sleep(1000)
                    onData(it)
                }
            }.start()
        }
    }

    val humiditySource = object : LegacyDataSource<Int> {
        override fun setOnData(onData: (Int) -> Unit) {
            Thread {
                listOf(50, 55, 60).forEach {
                    Thread.sleep(1500)
                    onData(it)
                }
            }.start()
        }
    }

    val combiner = LatestCombiner(
        temperatureSource,
        humiditySource
    ) { temp, humidity ->
        "Температура: $temp°C, Влажность: $humidity%"
    }

    combiner.start { combined ->
        println(combined)
    }
}