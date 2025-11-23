package nullable

class NullableParam {

    val testCard = TestDataClass()

//   fun someFun() {
//       var a: String = ""
//       testCard.card?.card?.let {
//           a = it
//       }
//   }

}


data class TestDataClass(
    val card: TestCard? = null
)
data class TestCard(
    val card: String? = null
)