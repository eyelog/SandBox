fun main() {


    val listCase = listOf<CaseClass>(
        CaseClass("00", false, false),
        CaseClass("01", true, false),
        CaseClass("02", false, true),
        CaseClass("03", true, true)
    )
    val a = listCase.get(0)

    val phoneContactForTransfers = listCase.find {
        (it.firstCase && it.secondCase)
        it.firstCase
        it.secondCase
    }

    println(phoneContactForTransfers?.name)
}

data class CaseClass(
    val name: String,
    val firstCase: Boolean,
    val secondCase: Boolean
)