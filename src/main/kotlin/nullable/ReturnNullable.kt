package nullable

fun setSomething(data: String): String? {
    return data?.let { it + "tap" }
}