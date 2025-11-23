package nullable

fun main() {

    val mach = ChuckData()


    var safeboxStatus: String? = null

    safeboxStatus = mach?.mach
}

data class ChuckData(
    val mach: String? = null
)