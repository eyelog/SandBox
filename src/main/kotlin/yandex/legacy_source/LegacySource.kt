package yandex.legacy_source

// Универсальный источник данных, который производит значения типа Т асинхронно
interface LegacyDataSource<T> {
    // Регистрирует колбэк, который вызывается при появлении нового элемента данных
    fun setOnData(onData: (data: T) -> Unit)
}

class LatestCombiner<A, B, R>(
    private val sourceA: LegacyDataSource<A>,
    private val sourceB: LegacyDataSource<B>,
    private val combine: (A, B) -> R
){

    private var latestA: A? = null
    private var latestB: B? = null

    /*
    * Начинает отслеживание обоих источников данных. Каждый раз, когда один из них выдаёт новое значение,
    * если оба источника уже отправили хотя бы одно значение, вызывется onCombined с результатом
    * выполнения combine(посленее значение из sourceA, последнее значение из sourceB).
    *
    * @param onCombined - коллбэк, который получает объединённый результат последних значени
    * */
    fun start(onCombined: (R) -> Unit) {

        sourceA.setOnData { dataA: A ->
            latestA = dataA
            checkAndCombine(onCombined)
        }

        sourceB.setOnData { dataB: B ->
            latestB = dataB
            checkAndCombine(onCombined)
        }
    }

    private fun checkAndCombine(onCombined: (R) -> Unit) {
        val a = latestA
        val b = latestB

        if (a != null && b != null) {
            val combined = combine(a, b)
            onCombined(combined)
        }
    }
}