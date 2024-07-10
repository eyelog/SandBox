package yandex.tasks

import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class MainUseCase
@Inject constructor(
    private val firstUseCase: FirstUseCase,
    private val secondUseCase: SecondUseCase,
    private val cartItemMapper: CartItemMapper
) {
    @CheckResult
    fun execute(orderedItems: List<Cart>): Completable {

        if (orderedItems.isEmpty()) return Completable.complete()

        return firstUseCase.getCartItems()
            .map { cartItems ->
                cartItems.filter { cartItem ->
                    orderedItems.contains(cartItem)
                }
            }
            .map(cartItemMapper::mapCartItem)
            .flatMapCompletable {
                if (it.isEmpty()) {
                    Completable.complete()
                } else {
                    secondUseCase.deleteItems(it)
                }
            }
    }
}

data class CartItemId(
    val cartItemId: Int,
    val skuId: Int,
    val bundleId: Int,
    val isPrimaryBundleItem: Boolean
)

class FirstUseCase {
    fun getCartItems(): Single<List<Cart>> {
        return Single.just(
            listOf(
                Cart(1, 1, 1, true),
                Cart(2, 2, 2, true),
                Cart(3, 3, 3, true)
            )
        )
    }
}

class SecondUseCase {
    fun deleteItems(it: List<CartItemId>): Completable {
        return Completable.complete()
    }

}

data class Result(
    val items: List<Cart>
)

data class Cart(
    val id: Int,
    val skuId: Int,
    val bundleId: Int,
    val isPrimaryBundleItem: Boolean
)


annotation class CheckResult

class CartItemMapper {
    fun mapCartItem(carts: List<Cart>): List<CartItemId> {
        return carts.map { cart ->
            CartItemId(
                cartItemId = cart.id,
                skuId = cart.skuId,
                bundleId = cart.bundleId,
                isPrimaryBundleItem = cart.isPrimaryBundleItem
            )
        }
    }

}