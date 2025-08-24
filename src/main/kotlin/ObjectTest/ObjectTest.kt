package ObjectTest

const val someIntConst = 1
private const val someStringConst = "1"

class ClassTest {
    val a = 1
    private val b = 1
    var ae = 1
    private var be = 1

    object ObjectTest {
        val a = 1
        private val b = 1
    }

    companion object {
        val c = 1
        private val d = 1
        const val e = 1
        private const val f = "1"
    }
}