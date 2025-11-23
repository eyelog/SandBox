package yandex.tasks

//import io.reactivex.rxjava3.core.Completable
//import io.reactivex.rxjava3.core.Single
//import javax.inject.Inject
//
//class MainUseCase
//@Inject constructor(
//    private val firstUseCase: FirstUseCase,
//    private val secondUseCase: SecondUseCase,
//) {
//    @CheckResult
//    fun execute(result: Result): Completable {
//        val orderedItems = result.items
//        return if (orderedItems.isEmpty()) {
//            Completable.complete()
//        } else {
//            firstUseCase.getCartItems()
//                .map { cartItems ->
//                    orderedItems.mapNotNull { orderItem ->
//                        cartItems.firstOrNull { it.id == orderItem.id}
//                    }
//                        .map { cartItem ->
//                            CartItemId (
//                                cartItemId = cartItem.id,
//                                skuId = cartItem.skuId,
//                                bundleId = cartItem.bundleId,
//                                isPrimaryBundleItem = cartItem.isPrimaryBundleItem
//                            )
//                        }
//                }
//                .flatMapCompletable {
//                    if (it.isEmpty()) {
//                        Completable.complete()
//                    } else {
//                        secondUseCase.deleteItems(it)
//                    }
//                }
//        }
//    }
//}
//
//data class CartItemId(
//    val cartItemId: Int,
//    val skuId: Int,
//    val bundleId: Int,
//    val isPrimaryBundleItem: Boolean
//)
//
//class FirstUseCase {
//    fun getCartItems(): Single<List<Cart>> {
//        return Single.just(
//            listOf(
//                Cart(1, 1, 1, true),
//                Cart(2, 2, 2, true),
//                Cart(3, 3, 3, true)
//            )
//        )
//    }
//}
//
//class SecondUseCase {
//    fun deleteItems(it: List<CartItemId>): Completable {
//        return Completable.complete()
//    }
//
//}
//
//data class Result(
//    val items: List<Cart>
//)
//
//data class Cart(
//    val id: Int,
//    val skuId: Int,
//    val bundleId: Int,
//    val isPrimaryBundleItem: Boolean
//)
//
//
//annotation class CheckResult