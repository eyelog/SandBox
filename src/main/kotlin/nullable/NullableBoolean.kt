package nullable

fun main() {


    val a = shouldFilterWidget(TestBoolClass())

    println(a)


}

fun shouldFilterWidget(widgetImplementation: SBoolClass): Boolean {
    return (widgetImplementation as? TestBoolClass)?.shouldShow == false
}

sealed class SBoolClass

data class TestBoolClass(
    val shouldShow: Boolean? = null
): SBoolClass()