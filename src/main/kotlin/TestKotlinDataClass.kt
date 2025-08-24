fun main() {

    val testKotlinDataClass = OtherTestKotlinDataClass(1, "1", true)
    val testKotlinDataClass2 = OtherTestKotlinDataClass(1, "1", true)

    println(testKotlinDataClass.hashCode())
    println(testKotlinDataClass2.hashCode())
    println(testKotlinDataClass == testKotlinDataClass2)

    val hashMap = hashMapOf<OtherTestKotlinDataClass, Int>()
}

data class TestKotlinDataClass(
    val a: Int,
    val b: String,
    val c: Boolean
)

class OtherTestKotlinDataClass(
    val a: Int,
    val b: String,
    val c: Boolean
){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as OtherTestKotlinDataClass

        if (a != other.a) return false
        if (b != other.b) return false
        return c == other.c
    }

    override fun hashCode(): Int {
        var result = a
        result = 31 * result + b.hashCode()
        result = 31 * result + c.hashCode()
        return result
    }

    override fun toString(): String {
        return "OtherTestKotlinDataClass(a=$a, b='$b', c=$c)"
    }
}
