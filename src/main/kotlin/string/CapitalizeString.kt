package string

import java.util.*

fun main() {

    val a = getCapitalizedName("name")

    println(a)

}

private fun getCapitalizedName(name: String): String {
    return name.replaceFirstChar { firstChar ->
        if (firstChar.isLowerCase()) {
            firstChar.titlecase(Locale.getDefault())
        } else {
            firstChar.toString()
        }
    }
}