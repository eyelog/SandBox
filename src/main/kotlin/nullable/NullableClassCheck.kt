package nullable

data class SomeCheckClass(
    val text: String? = null
)

fun checkNullableThing(){

    val supText = "supText"
    val tapText: SomeCheckClass? = null

    val fullName = tapText?.text ?: supText
}